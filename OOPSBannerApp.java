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
 *   <li>HashMap for efficient character pattern storage and retrieval</li>
 *   <li>Collections Framework for modular pattern management</li>
 * </ul>
 *
 * @author  your-name
 * @version 1.0
 */

import java.util.HashMap;
import java.util.Map;

public class OOPSBannerApp {

    /**
     * Builds and returns a HashMap containing character patterns for banner display.
     * Maps each character (O, P, S) to its corresponding 7-line ASCII art pattern.
     *
     * Key Benefits:
     * - ENCAPSULATION: Character patterns abstracted within HashMap
     * - MODULARITY: Clear separation between pattern creation and display
     * - SCALABILITY: Easy to add new characters without modifying display code
     *
     * @return HashMap with Character keys and String[] pattern values
     */
    public static Map<Character, String[]> buildCharacterPatternMap() {
        Map<Character, String[]> patternMap = new HashMap<>();

        // Pattern for 'O' (9 characters wide, 7 lines)
        patternMap.put('O', new String[] {
            "*********",
            "*       *",
            "*       *",
            "*       *",
            "*       *",
            "*       *",
            "*********"
        });

        // Pattern for 'P' (9 characters wide, 7 lines)
        patternMap.put('P', new String[] {
            "*********",
            "*       *",
            "*       *",
            "*********",
            "*        ",
            "*        ",
            "*        "
        });

        // Pattern for 'S' (9 characters wide, 7 lines)
        patternMap.put('S', new String[] {
            "*********",
            "*        ",
            "*        ",
            "*********",
            "        *",
            "        *",
            "*********"
        });

        return patternMap;
    }

    /**
     * Constructs a single banner line for a given line index using the pattern map.
     * Combines patterns for each character in the word using StringBuilder.
     *
     * Key Concepts:
     * - NESTED LOOPS: Iterates through word characters (outer), each at line index
     * - STRINGBUILDER: Efficiently concatenates pattern segments for each line
     * - MAP LOOKUP: Retrieves patterns via HashMap for O(1) average time complexity
     *
     * @param lineIndex    the line number (0-6) to construct
     * @param word         the word to display (e.g., "OOPS")
     * @param patternMap   HashMap containing all character patterns
     * @return the constructed banner line for the specified line index
     */
    public static String getBannerLine(int lineIndex, String word, Map<Character, String[]> patternMap) {
        StringBuilder line = new StringBuilder();

        // Outer loop: iterate through each character in the word
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);

            // Add separator between characters (3 spaces)
            if (i > 0) {
                line.append("   ");
            }

            // Inner access: retrieve pattern and get the specific line segment
            String[] pattern = patternMap.get(ch);
            if (pattern != null && lineIndex < pattern.length) {
                line.append(pattern[lineIndex]);
            }
        }

        return line.toString();
    }
    /**
     * Entry point of the application. Prints "OOPS" to standard output.
     *
     * UC8: Use Map for Character Patterns and Render via Function
     * Builds a HashMap containing character-to-pattern mappings, then uses it
     * to retrieve and display patterns for the word "OOPS". This approach leverages
     * the Collections Framework for more efficient and scalable pattern management.
     *
     * Key Improvements Over UC7:
     * - EFFICIENCY: HashMap provides O(1) average case lookup vs linear search
     * - SCALABILITY: Easy to add new characters without modifying display code
     * - REUSABILITY: Same HashMap can be used for different words
     * - CLARITY: Word-based approach is more intuitive than array management
     *
     * Key Concepts Demonstrated:
     * - HashMap for efficient key-value storage of character patterns
     * - Collections Framework usage for separation of concerns
     * - Nested loops: outer loop for lines, inner for character lookup
     * - StringBuilder for efficient string concatenation
     *
     * @param args command-line arguments (ignored)
     */
    public static void main(String[] args) {
        // UC8: Build the character pattern map using HashMap
        // Maps each character to its 7-line banner representation
        Map<Character, String[]> patternMap = buildCharacterPatternMap();

        // Define the word to display
        String word = "OOPS";

        // Build the banner lines by iterating through each of 7 lines
        // For each line, lookup patterns from the HashMap and combine them
        String[] lines = {
            getBannerLine(0, word, patternMap),
            getBannerLine(1, word, patternMap),
            getBannerLine(2, word, patternMap),
            getBannerLine(3, word, patternMap),
            getBannerLine(4, word, patternMap),
            getBannerLine(5, word, patternMap),
            getBannerLine(6, word, patternMap)
        };

        // Print the banner using an enhanced for-loop
        for (String line : lines) {
            System.out.println(line);
        }
    }
}
