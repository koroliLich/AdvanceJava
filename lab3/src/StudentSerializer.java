/**
 * The StudentSerializer class provides methods for manually serializing Student objects to JSON and
 * XML formats.
 */
public class StudentSerializer {

  /**
   * Serializes a Student object to JSON format.
   *
   * @param student the Student object to serialize
   * @return the JSON representation of the Student object
   */
  public static String toJson(Student student) {
    return String.format("{\"firstName\": \"%s\", \"lastName\": \"%s\", \"email\": \"%s\"}",
        student.getFirstName(), student.getLastName(), student.getEmail());
  }

  /**
   * Serializes a Student object to XML format.
   *
   * @param student the Student object to serialize
   * @return the XML representation of the Student object
   */
  public static String toXml(Student student) {
    return String.format("<student><firstName>%s</firstName><lastName>%s</lastName><email>%s</email></student>",
        student.getFirstName(), student.getLastName(), student.getEmail());
  }
}
