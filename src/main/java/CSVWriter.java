import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class CSVWriter {
    private static final String SAMPLE_CSV_FILE = "students.csv";

    public static void main(String[] args) throws IOException {
        try (
                BufferedWriter writer = Files.newBufferedWriter(Paths.get(SAMPLE_CSV_FILE));

                CSVPrinter csvPrinter = new CSVPrinter(writer, CSVFormat.DEFAULT
                        .withHeader("ID", "Numele", "Universitatea", "Profesia","Hobby"));
        ) {
            csvPrinter.printRecord("001", "Carapirea", "USM", "student","programare");
            csvPrinter.printRecord("002", "Spînu Dan", "USM", "student","sport");
            csvPrinter.printRecord("003", "Andronic Roman", "USM", "student","programare");
            csvPrinter.printRecord("004", "Barbos Oleg", "USM", "student","programare");
            csvPrinter.printRecord(Arrays.asList("005", "Temciuc Nicolae", "USM", "student", "sport"));

            csvPrinter.flush();
        }
    }
}