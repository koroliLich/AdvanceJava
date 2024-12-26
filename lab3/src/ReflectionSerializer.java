import java.lang.reflect.Field;

/**
 * The ReflectionSerializer class provides methods for serializing objects to JSON and XML formats
 * using reflection.
 */
public class ReflectionSerializer {

  /**
   * Serializes an object to JSON format using reflection.
   *
   * @param obj the object to serialize
   * @return the JSON representation of the object
   */
  public static String toJson(Object obj) throws IllegalAccessException {
    Class<?> clazz = obj.getClass();
    StringBuilder json = new StringBuilder("{");
    Field[] fields = clazz.getDeclaredFields();
    for (Field field : fields) {
      if (field.isAnnotationPresent(XmlJsonField.class)) {
        field.setAccessible(true);
        XmlJsonField annotation = field.getAnnotation(XmlJsonField.class);
        String key = annotation.value();
        Object value = field.get(obj);
        if (value instanceof String) {
          json.append(String.format("\"%s\": \"%s\",", key, value));
        } else {
          json.append(String.format("\"%s\": %s,", key, value));
        }
      }
    }
    json.deleteCharAt(json.length() - 1);
    json.append("}");
    return json.toString();
  }

  /**
   * Serializes an object to XML format using reflection.
   *
   * @param obj the object to serialize
   * @return the XML representation of the object
   */
  public static String toXml(Object obj) throws IllegalAccessException {
    Class<?> clazz = obj.getClass();
    if (!clazz.isAnnotationPresent(XmlRoot.class)) {
      throw new IllegalArgumentException("Class must be annotated with @XmlRoot");
    }
    StringBuilder xml = new StringBuilder();
    XmlRoot root = clazz.getAnnotation(XmlRoot.class);
    xml.append("<").append(root.value()).append(">");
    Field[] fields = clazz.getDeclaredFields();
    for (Field field : fields) {
      if (field.isAnnotationPresent(XmlJsonField.class)) {
        field.setAccessible(true);
        XmlJsonField annotation = field.getAnnotation(XmlJsonField.class);
        String tag = annotation.value();
        Object value = field.get(obj);
        xml.append(String.format("<%s>%s</%s>", tag, value, tag));
      }
    }
    xml.append("</").append(root.value()).append(">");
    return xml.toString();
  }
}
