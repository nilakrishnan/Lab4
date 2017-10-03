/*
 * The following code needs a lot of TLC. So give it some!
 *
 * 1. Fix all checkstyle errors
 * 2. Determine what it does (it's going to be tough before you finish #1)
 * 3. Improve the name of the methods and variables
 * 4. Add comments and Javadoc comments where needed
 * 5. Remove unnecessary comments as appropriate
 */

/**
 * Reclaim the given code, and figure out what the method does.
 */

public class ReclamationProject {
    /**
     * Finds longest string that is common between the two parameters.
     * @param a first String
     * @param b second String
     * @return longest String between a and b
     */
    public static String longestSharedString(final String a, final String b) {
        String first = a;
        String second = b;
        String shared = "";
        if (a.length() > b.length()) {
            String c = a;
            first = b;
            second = c;
        }
        for (int i = 0; i < first.length(); i++) {
            for (int j = first.length() - i; j > 0; j--) {
                for (int k = 0; k <= second.length() - j; k++) {
                    if (first.regionMatches(i, second, k, j) && j > shared.length()) {
                            shared = first.substring(i, i + j);
                    }
                }
            }
        } return shared;
    }

    /**
     * Test if it works!
     * @param args inputs
     */
    public static void main(final String[] args) {
        System.out.print(longestSharedString("abcdefghijklmnopqrstuvwxyz", "abclmnop"));
    }
}
