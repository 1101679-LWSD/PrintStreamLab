import java.io.*;
import java.nio.file.*;

/**
 *This is for instructor to test your code on this lab. This test
 * verifies that running the program on the provided sample input
 * produces the expected output file. 
 * */
public class PrintStreamTest {

    public static void main(String[] args) throws Exception {
        String inputFile = "test/resources/scores.txt";
        String outputFile = "test/resources/generated_output.txt";
        String userInput = inputFile + System.lineSeparator() + outputFile + System.lineSeparator();

        InputStream originalIn = System.in;
        PrintStream originalOut = System.out;

        try {
            System.setIn(new ByteArrayInputStream(userInput.getBytes()));
            PrintStreamLab.main(new String[0]);
        } finally {
            System.setIn(originalIn);
            System.setOut(originalOut);
        }
        String generated = new String(Files.readAllBytes(Paths.get(outputFile))).trim();
        String expected = new String(Files.readAllBytes(Paths.get("test/resources/scores_summary.txt"))).trim();

        if (expected.equals(generated)) {
            System.out.println("Test passed: Output matches expected summary");
        } else {
            System.out.println("Test failed: Output does not match expected summary");
            System.out.println("Expected: " + expected);
            System.out.println("Generated: " + generated);
        }
    }
}
