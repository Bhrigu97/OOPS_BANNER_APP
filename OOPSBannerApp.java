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
 *   <li>Inner static classes for pattern encapsulation</li>
 *   <li>OOPS principles: encapsulation, reusability, abstraction</li>
 * </ul>
 *
 * @author  your-name
 * @version 1.0
 */
public class OOPSBannerApp {

    /**
     * Inner static class to encapsulate a character and its banner pattern.
     * This class represents a character (O, P, S, etc.) and its corresponding
     * 7-line banner representation (9 characters wide per line).
     *
     * <p>Key OOPS Principles:
     * <ul>
     *   <li>ENCAPSULATION – Encapsulates a character and its pattern</li>
     *   <li>REUSABILITY – Can be extended for more characters without modifying display logic</li>
     *   <li>ABSTRACTION – Provides clean interface for pattern access</li>
     * </ul>
     */
    public static class CharacterPatternMap {
        private char character;
        private String[] pattern;

        /**
         * Constructor to initialize the character and its banner pattern.
         *
         * @param character the character (e.g., 'O', 'P', 'S')
         * @param pattern   the 7-line pattern array (9 characters per line)
         */
        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        /**
         * Getter method to access the character.
         *
         * @return the character stored in this instance
         */
        public char getCharacter() {
            return character;
        }

        /**
         * Getter method to access the pattern array.
         *
         * @return the 7-line pattern array
         */
        public String[] getPattern() {
            return pattern;
        }
    }

    /**
     * Returns a CharacterPatternMap instance for the letter 'O'.
     *
     * @return CharacterPatternMap with 'O' character and its 7-line pattern
     */
    public static CharacterPatternMap getOPatternMap() {
        return new CharacterPatternMap('O', new String[] {
            "*********",
            "*       *",
            "*       *",
            "*       *",
            "*       *",
            "*       *",
            "*********"
        });
    }

    /**
     * Returns a CharacterPatternMap instance for the letter 'P'.
     *
     * @return CharacterPatternMap with 'P' character and its 7-line pattern
     */
    public static CharacterPatternMap getPPatternMap() {
        return new CharacterPatternMap('P', new String[] {
            "*********",
            "*       *",
            "*       *",
            "*********",
            "*        ",
            "*        ",
            "*        "
        });
    }

    /**
     * Returns a CharacterPatternMap instance for the letter 'S'.
     *
     * @return CharacterPatternMap with 'S' character and its 7-line pattern
     */
    public static CharacterPatternMap getSPatternMap() {
        return new CharacterPatternMap('S', new String[] {
            "*********",
            "*        ",
            "*        ",
            "*********",
            "        *",
            "        *",
            "*********"
        });
    }

    /**
     * Constructs a single banner line combining patterns from multiple
     * CharacterPatternMap instances at a specified line index.
     * Uses StringBuilder for efficient string concatenation.
     *
     * @param lineIndex    the line number (0-6) to construct
     * @param patternMaps  array of CharacterPatternMap objects to combine
     * @return the constructed banner line with all characters
     */
    public static String getBannerLine(int lineIndex, CharacterPatternMap[] patternMaps) {
        StringBuilder line = new StringBuilder();
        
        for (int i = 0; i < patternMaps.length; i++) {
            if (i > 0) {
                line.append("   ");  // Append 3 spaces separator between characters
            }
            line.append(patternMaps[i].getPattern()[lineIndex]);
        }
        
        return line.toString();
    }
    /**
     * Entry point of the application. Prints "OOPS" to standard output.
     *
     * UC7: Store Character Pattern in a Class
     * Creates CharacterPatternMap instances for O, P, and S, then uses them
     * to generate and display the banner. This approach provides better
     * organization, reusability, and scalability for managing character patterns.
     *
     * Key Benefits:
     * - ENCAPSULATION: Character patterns are encapsulated within CharacterPatternMap
     * - MODULARITY: Separation of concerns between data and display logic
     * - REUSABILITY: PatternMap instances can be used for different words
     * - ABSTRACTION: Clean interface for pattern access
     * - EXTENSIBILITY: Easy to add new characters without modifying display code
     *
     * @param args command-line arguments (ignored)
     */
    public static void main(String[] args) {
        // Create CharacterPatternMap instances for O, O, P, S
        CharacterPatternMap[] patternMaps = {
            getOPatternMap(),
            getOPatternMap(),
            getPPatternMap(),
            getSPatternMap()
        };

        // Declare and initialize a String array using method calls
        // that leverage CharacterPatternMap objects
        String[] lines = {
            getBannerLine(0, patternMaps),
            getBannerLine(1, patternMaps),
            getBannerLine(2, patternMaps),
            getBannerLine(3, patternMaps),
            getBannerLine(4, patternMaps),
            getBannerLine(5, patternMaps),
            getBannerLine(6, patternMaps)
        };

        // Print the banner using an enhanced for-loop
        for (String line : lines) {
            System.out.println(line);
        }
    }
}
