/**
 * The CourseSerializer class provides methods for manually serializing Course objects to JSON and
 * XML formats.
 */
public class CourseSerializer {

  /**
   * Serializes a Course object to JSON format.
   *
   * @param course the Course object to serialize
   * @return the JSON representation of the Course object
   */
  public static String toJson(Course course) {
    return String.format("{\"subject\": \"%s\", \"semester\": %d, \"studentsLimit\": %d}",
        course.getSubject(), course.getSemester(), course.getStudentsLimit());
  }

  /**
   * Serializes a Course object to XML format.
   *
   * @param course the Course object to serialize
   * @return the XML representation of the Course object
   */
  public static String toXml(Course course) {
    return String.format(
        "<course><subject>%s</subject><semester>%d</semester><studentsLimit>%d</studentsLimit></course>",
        course.getSubject(), course.getSemester(), course.getStudentsLimit());
  }
}
