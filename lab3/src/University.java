/**
 * The University example class.
 */
@XmlRoot("university")
public class University {

  @XmlJsonField("name")
  private String name;

  @XmlJsonField("address")
  private String address;

  /**
   * Constructs a University with the specified attributes.
   *
   * @param name    Name of the university.
   * @param address Address of the university.
   */
  public University(String name, String address) {
    this.name = name;
    this.address = address;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }
}
