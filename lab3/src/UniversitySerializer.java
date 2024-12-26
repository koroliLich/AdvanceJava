/**
 * The UniversitySerializer class provides methods for manually serializing University objects to
 * JSON and XML formats.
 */
public class UniversitySerializer {

  /**
   * Serializes a University object to JSON format.
   *
   * @param university the University object to serialize
   * @return the JSON representation of the University object
   */
  public static String toJson(University university) {
    return String.format("{\"name\": \"%s\", \"address\": \"%s\"}",
        university.getName(), university.getAddress());
  }

  /**
   * Serializes a University object to XML format.
   *
   * @param university the University object to serialize
   * @return the XML representation of the University object
   */
  public static String toXml(University university) {
    return String.format("<university><name>%s</name><address>%s</address></university>",
        university.getName(), university.getAddress());
  }
}
