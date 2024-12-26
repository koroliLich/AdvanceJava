/**
 * The ManualSerializer class provides methods for manually serializing objects to JSON and XML formats.
 */
public class ManualSerializer {

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
        return String.format("<course><subject>%s</subject><semester>%d</semester><studentsLimit>%d</studentsLimit></course>",
                course.getSubject(), course.getSemester(), course.getStudentsLimit());
    }

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
