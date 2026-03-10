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
 *   <li>Static helper methods for modular design</li>
 * </ul>
 *
 * @author  your-name
 * @version 1.0
 */
public class OOPSBannerApp {

    /**
     * Returns the pattern (array of 7 lines) for the letter 'O'.
     * Each line is 9 characters wide.
     *
     * @return String array containing the O pattern
     */
    public static String[] getOPattern() {
        return new String[] {
            "*********",
            "*       *",
            "*       *",
            "*       *",
            "*       *",
            "*       *",
            "*********"
        };
    }

    /**
     * Returns the pattern (array of 7 lines) for the letter 'P'.
     * Each line is 9 characters wide.
     *
     * @return String array containing the P pattern
     */
    public static String[] getPPattern() {
        return new String[] {
            "*********",
            "*       *",
            "*       *",
            "*********",
            "*        ",
            "*        ",
            "*        "
        };
    }

    /**
     * Returns the pattern (array of 7 lines) for the letter 'S'.
     * Each line is 9 characters wide.
     *
     * @return String array containing the S pattern
     */
    public static String[] getSPattern() {
        return new String[] {
            "*********",
            "*        ",
            "*        ",
            "*********",
            "        *",
            "        *",
            "*********"
        };
    }

    /**
     * Constructs a single banner line for a given line index.
     * Combines O, O, P, S patterns at the specified line using String.join().
     *
     * @param lineIndex the line number (0-6) to construct
     * @return the constructed banner line with all four letters
     */
    public static String getBannerLine(int lineIndex) {
        String[] oPattern = getOPattern();
        String[] pPattern = getPPattern();
        String[] sPattern = getSPattern();

        return String.join("   ",
            oPattern[lineIndex],
            oPattern[lineIndex],
            pPattern[lineIndex],
            sPattern[lineIndex]
        );
    }
    /**
     * Entry point of the application. Prints "OOPS" to standard output.
     *
     * @param args command-line arguments (ignored)
     */
    public static void main(String[] args) {
        // UC6: Render OOPS as Banner by Refactoring Logic into Helper Methods
        // Declare and initialize a String array using inline initialization
        // with calls to helper methods that encapsulate character patterns.
        // This approach improves modularity, reusability, and maintainability
        // by separating pattern generation into dedicated static methods.
        String[] lines = {
            getBannerLine(0),
            getBannerLine(1),
            getBannerLine(2),
            getBannerLine(3),
            getBannerLine(4),
            getBannerLine(5),
            getBannerLine(6)
        };

        // Print the banner using an enhanced for-loop
        for (String line : lines) {
            System.out.println(line);
        }
    }
}
