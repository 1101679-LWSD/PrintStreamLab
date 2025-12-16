import java.io.*;
import java.util.*;

public class PrintStreamLab {
    /**
     creates a new PrintStream that writes to the given file.
     param f the file to write to
     return a new PrintStream for writing to f
     throws FileNotFoundException if the file cannot be opened or created
     */
    public static PrintStream makePrintStream(File f) throws FileNotFoundException {
        // TODO:
        //create and return a PrintStream that writes to file f.

        return null;
    }

    /**
     copies all lines from the given Scanner to the PrintStream, one line at a time.
     do NOT close the PrintStream or Scanner inside this method.
     param out   the PrintStream to write to
     param input the Scanner providing lines (could be from a File or a String)
     */
    public static void printLines(PrintStream out, Scanner input) {
        // TODO:
        // Use a loop with hasNextLine()/nextLine() and write each line to out.
    }
    /**
     param inputFile  the file containing employee data
     param outputFile the file to which the summary report will be written
     throws FileNotFoundException if the input or output file cannot be opened
     */
    public static void hoursReport(File inputFile, File outputFile) throws FileNotFoundException {
        // TODO: implement hoursReport using the required Chapter 6 pattern.
        //
        // Required pattern:
        // 1) Scanner fileScan = initializeScanner(inputFile);
        // 2) PrintStream out = makePrintStream(outputFile);
        // 3) while (fileScan.hasNextLine()) { ... }
        //above is pseudocode only, do not include in your solution
    }
    public static void main(String[] args) throws FileNotFoundException {
        // don't change this method
        Scanner console = new Scanner(System.in);
        String inputFileName = console.nextLine();
        String outputFileName = console.nextLine();
        hoursReport(new File(inputFileName), new File(outputFileName));
        console.close();
    }
}
