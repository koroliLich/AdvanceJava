import java.util.Optional;
import java.util.stream.Gatherer;

/**
 * A custom gatherer that skips a specified number of people from a given city.
 */
class PersonGatherer implements Gatherer<Person, Optional<Person>, Person> {

    private int skipCount;
    private final String skipCity;

    /**
     * Constructs a PersonGatherer with the specified parameters.
     *
     * @param skipCount Number of people to skip.
     * @param skipCity  City to exclude participants from.
     */
    public PersonGatherer(int skipCount, String skipCity) {
        this.skipCount = skipCount;
        this.skipCity = skipCity;
    }

    @Override
    public Integrator<Optional<Person>, Person, Person> integrator() {
        return Gatherer.Integrator.of((_, element, downstream) -> {
            if (element.getCity().equals(skipCity) && skipCount > 0) {
                skipCount--;
                return true;
            }
            return downstream.push(element);
        });
    }
}
