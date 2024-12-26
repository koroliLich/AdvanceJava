/**
 * The Main class demonstrates the serialization of objects to JSON and XML formats
 * using both reflection-based and manual serialization methods.
 */
public class Main {

  /**
   * Main entry point of the program.
   */
  public static void main(String[] args) throws IllegalAccessException {
    University university = new University("Kyiv Polytechnic Institute", "Берестейський проспект, 37");
    Course course = new Course("ПЗ Java", 5, 60);
    Student student = new Student("John", "Doe", "john@gmail.com");

    long start = System.currentTimeMillis();
    System.out.println(ReflectionSerializer.toJson(university));
    System.out.println(ReflectionSerializer.toJson(course));
    System.out.println(ReflectionSerializer.toJson(student));
    System.out.println(ReflectionSerializer.toXml(university));
    System.out.println(ReflectionSerializer.toXml(course));
    System.out.println(ReflectionSerializer.toXml(student));
    long end = System.currentTimeMillis();
    System.out.println("Reflection serialization time: " + (end - start) + " ms");

    start = System.currentTimeMillis();
    System.out.println(UniversitySerializer.toJson(university));
    System.out.println(CourseSerializer.toJson(course));
    System.out.println(StudentSerializer.toJson(student));
    System.out.println(UniversitySerializer.toXml(university));
    System.out.println(CourseSerializer.toXml(course));
    System.out.println(StudentSerializer.toXml(student));
    end = System.currentTimeMillis();
    System.out.println("Manual serialization time: " + (end - start) + " ms");
  }
}
