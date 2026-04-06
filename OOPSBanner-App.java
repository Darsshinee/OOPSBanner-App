import java.util.*;

public class OOPSBanner-App {

    public static Map<Character, String[]> createCharacterPatterns() {

        Map<Character, String[]> map = new HashMap<>();

        map.put('O', new String[]{
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                " *** "
        });

        map.put('P', new String[]{
                "**** ",
                "*   *",
                "**** ",
                "*    ",
                "*    "
        });

        map.put('S', new String[]{
                " ****",
                "*    ",
                " *** ",
                "    *",
                "**** "
        });

        return map;
    }

    public static String buildBanner(String message, Map<Character, String[]> map) {

        StringBuilder banner = new StringBuilder();
        int rows = 5;

        for (int i = 0; i < rows; i++) {
            for (char ch : message.toCharArray()) {
                String[] pattern = map.get(ch);
                if (pattern != null) {
                    banner.append(pattern[i]).append("  ");
                }
            }
            banner.append("\n");
        }

        return banner.toString();
    }

    public static void main(String[] args) {

        Map<Character, String[]> characterMap = createCharacterPatterns();

        String message = "OOPS";

        String banner = buildBanner(message, characterMap);

        System.out.println(banner);
    }
}