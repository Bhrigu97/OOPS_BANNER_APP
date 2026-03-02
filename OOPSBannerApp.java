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
        // UC2: Render OOPS as a banner using individual println calls.
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

        // UC4: store all banner lines in a String array and print via loop
        String[] lines = new String[7];
        for (int i = 0; i < 7; i++) {
            // build each line using String.join (UC3 technique)
            lines[i] = String.join("   ",
                letterO[i],
                letterO[i],
                letterP[i],
                letterS[i]
            );
        }

        // print the banner lines with an enhanced for-loop
        for (String line : lines) {
            System.out.println(line);
        }
    }
}
