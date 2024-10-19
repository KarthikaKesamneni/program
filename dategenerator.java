import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.ThreadLocalRandom;

public class RandomDateGenerator {

    public static void main(String[] args) {
        // Define the start and end dates
        LocalDate startDate = LocalDate.of(2020, 1, 1); // Start date
        LocalDate endDate = LocalDate.of(2024, 12, 31); // End date

        // Generate a random date
        LocalDate randomDate = generateRandomDate(startDate, endDate);
        
        // Format the random date for display
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        System.out.println("Randomly generated date: " + randomDate.format(formatter));
    }

    private static LocalDate generateRandomDate(LocalDate start, LocalDate end) {
        // Get epoch days for start and end dates
        long startEpoch = start.toEpochDay();
        long endEpoch = end.toEpochDay();
        
        // Generate a random epoch day between start and end
        long randomEpoch = ThreadLocalRandom.current().nextLong(startEpoch, endEpoch + 1);
        
        // Return the random date
        return LocalDate.ofEpochDay(randomEpoch);
    }
}
