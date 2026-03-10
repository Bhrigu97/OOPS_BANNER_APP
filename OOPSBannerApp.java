/**
 * OOPSBannerApp is a simple Java application that demonstrates
 * the foundational concepts of a Java program by printing the
 * literal text "OOPS" (Object-Oriented Programming System) to the console.
 *
 * <p>Key concepts showcased in this example include:</p>
 * <ul>
 *   <li>Class definition</li>
 *   <li>Main method as the entry point</li>
 *   <li>Static method invocation</li>
 *   <li>String literals and console output</li>
 * </ul>
 *
 * @author  your-name
 * @version 1.0
 */
public class OOPSBannerApp {
    /**
     * Entry point of the application. Prints "OOPS" to standard output.
     *
     * @param args command-line arguments (ignored)
     */
    public static void main(String[] args) {
        // Define each letter as a 7-element pattern array; width is 9.
        String[] letterO = {
            "*********",
            "*       *",
            "*       *",
            "*       *",
            "*       *",
            "*       *",
            "*********"
        };

        String[] letterP = {
            "*********",
            "*       *",
            "*       *",
            "*********",
            "*        ",
            "*        ",
            "*        "
        };

        String[] letterS = {
            "*********",
            "*        ",
            "*        ",
            "*********",
            "        *",
            "        *",
            "*********"
        };

        // UC5: Render OOPS as Banner using Inline Array Initialization
        // Declare and initialize a String array in a single statement using
        // array literal syntax with String.join() method calls to construct
        // each banner line. This approach combines declaration, initialization,
        // and population in one concise statement, eliminating the need for
        // separate population statements.
        String[] lines = {
            String.join("   ", letterO[0], letterO[0], letterP[0], letterS[0]),
            String.join("   ", letterO[1], letterO[1], letterP[1], letterS[1]),
            String.join("   ", letterO[2], letterO[2], letterP[2], letterS[2]),
            String.join("   ", letterO[3], letterO[3], letterP[3], letterS[3]),
            String.join("   ", letterO[4], letterO[4], letterP[4], letterS[4]),
            String.join("   ", letterO[5], letterO[5], letterP[5], letterS[5]),
            String.join("   ", letterO[6], letterO[6], letterP[6], letterS[6])
        };

        // Print the banner using an enhanced for-loop
        for (String line : lines) {
            System.out.println(line);
        }
    }
}
