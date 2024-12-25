import java.util.*;
import java.util.stream.Collectors;

/**
 * Utility class for analyzing monthly incomes and identifying outliers.
 */
public class IncomeAnalysis {

    /**
     * Analyzes the income distribution and identifies outliers.
     *
     * @param people List of survey participants.
     * @return A map containing the count of data within bounds and outliers.
     */
    public static Map<String, Long> analyzeIncomes(List<Person> people) {
        List<Integer> incomes = people.stream()
                .map(Person::getMonthlyIncome)
                .sorted()
                .toList();

        int Q1 = incomes.get((int) Math.ceil(0.25 * incomes.size()) - 1);
        int Q3 = incomes.get((int) Math.ceil(0.75 * incomes.size()) - 1);
        double lowerBound = Q1 - 1.5 * (Q3 - Q1);
        double upperBound = Q3 + 1.5 * (Q3 - Q1);

        Map<Boolean, Long> result = people.stream()
                .collect(Collectors.partitioningBy(
                        person -> person.getMonthlyIncome() >= lowerBound && person.getMonthlyIncome() <= upperBound,
                        Collectors.counting()
                ));
        Map<String, Long> finalResult = new HashMap<>();
        finalResult.put("data", result.get(true));
        finalResult.put("outliers", result.get(false));
        return finalResult;
    }
}
