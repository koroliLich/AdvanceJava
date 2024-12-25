import java.time.LocalDate;

/**
 * Represents a survey participant with name, surname, birthdate, city, and monthly income.
 */
public class Person {

    private String firstName;
    private String lastName;
    private LocalDate birthDate;
    private String city;
    private int monthlyIncome;

    /**
     * Constructs a Person with the specified attributes.
     *
     * @param firstName     First name of the person.
     * @param lastName      Last name of the person.
     * @param birthDate     Birthdate of the person.
     * @param city          City where the person resides.
     * @param monthlyIncome Monthly income of the person.
     */
    public Person(String firstName, String lastName, LocalDate birthDate, String city,
                  int monthlyIncome) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.city = city;
        this.monthlyIncome = monthlyIncome;
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

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getMonthlyIncome() {
        return monthlyIncome;
    }

    public void setMonthlyIncome(int monthlyIncome) {
        this.monthlyIncome = monthlyIncome;
    }
}
