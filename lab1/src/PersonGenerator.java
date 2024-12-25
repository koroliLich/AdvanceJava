import java.time.LocalDate;
import java.util.Random;
import java.util.stream.Stream;

/**
 * Generates random Person objects using Stream API.
 */
public class PersonGenerator {

    private static final String[] NAMES = {"Ivan", "Olena", "Andriy", "Svitlana", "Dmytro"};
    private static final String[] SURNAMES = {"Shevchenko", "Koval", "Bondarenko", "Tkachenko", "Mazur"};
    private static final String[] CITIES = {"Kyiv", "Lviv", "Odessa", "Kharkiv", "Dnipro"};

    /**
     * Generates a stream of random Person objects.
     *
     * @return A stream of Person objects.
     */
    public static Stream<Person> generatePeople() {
        Random random = new Random();
        return Stream.generate(() -> new Person(
                NAMES[random.nextInt(NAMES.length)],
                SURNAMES[random.nextInt(SURNAMES.length)],
                LocalDate.now().minusYears(18 + random.nextInt(50)),
                CITIES[random.nextInt(CITIES.length)],
                10_000 + random.nextInt(90_000)
        ));
    }
}
