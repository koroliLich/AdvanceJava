import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Main class for running the survey analysis application.
 */
public class Main {

    /**
     * Entry point of the application.
     *
     * @param args Command-line arguments (not used).
     */
    public static void main(String[] args) {
        int N = 10;
        String cityToSkip = "Kyiv";

        // Generate and filter participants
        List<Person> people = PersonGenerator.generatePeople()
                .gather(new PersonGatherer(N, cityToSkip))
                .limit(500)
                .collect(Collectors.toList());
        people.forEach(System.out::println);

        // Group participants by first name
        Map<String, List<Person>> groupedPeople = people.stream()
                .collect(Collectors.groupingBy(Person::getFirstName));
        groupedPeople.forEach((name, group) -> System.out.println(name + ": " + group.size()));

        // Collect statistics on incomes
        Map<String, Object> statistics = people.stream()
                .collect(new IncomeStatisticsCollector());
        System.out.println(statistics);

        // Analyze income distribution and detect outliers
        Map<String, Long> incomeAnalysis = IncomeAnalysis.analyzeIncomes(people);
        System.out.println(incomeAnalysis);
    }
}
