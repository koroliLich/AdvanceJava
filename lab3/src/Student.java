/**
 * The Student example class.
 */
@XmlRoot("student")
public class Student {

  @XmlJsonField("firstName")
  private String firstName;

  @XmlJsonField("lastName")
  private String lastName;

  @XmlJsonField("email")
  private String email;

  /**
   * Constructs a Student with the specified attributes.
   *
   * @param firstName First name of the student.
   * @param lastName  Last name of the student.
   * @param email     Email address of the student.
   */
  public Student(String firstName, String lastName, String email) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.email = email;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }
}
