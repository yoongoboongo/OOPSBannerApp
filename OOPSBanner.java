import java.util.HashMap;

public class OOPSBanner {

    public static void main(String[] args) {

        HashMap<Character, String[]> patternMap = new HashMap<>();

        String[] O = {
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                " *** "
        };

        String[] P = {
                "**** ",
                "*   *",
                "**** ",
                "*    ",
                "*    "
        };

        String[] S = {
                " ****",
                "*    ",
                " *** ",
                "    *",
                "**** "
        };

        patternMap.put('O', O);
        patternMap.put('P', P);
        patternMap.put('S', S);

        String word = "OOPS";

        renderBanner(word, patternMap);
    }

    public static void renderBanner(String word, HashMap<Character, String[]> patternMap) {

        int rows = patternMap.get('O').length;

        for(int i = 0; i < rows; i++) {

            for(int j = 0; j < word.length(); j++) {

                char letter = word.charAt(j);

                String[] pattern = patternMap.get(letter);

                System.out.print(pattern[i] + " ");
            }

            System.out.println();
        }
    }
}