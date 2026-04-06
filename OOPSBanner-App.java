import java.util.*;

public class OOPSBanner-App {

    static class CharacterPatternMap {
        private char character;
        private String[] pattern;

        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public char getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    public static CharacterPatternMap[] createCharacterPatterns() {

        CharacterPatternMap[] map = new CharacterPatternMap[4];

        map[0] = new CharacterPatternMap('O', new String[]{
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                " *** "
        });

        map[1] = new CharacterPatternMap('P', new String[]{
                "**** ",
                "*   *",
                "**** ",
                "*    ",
                "*    "
        });

        map[2] = new CharacterPatternMap('P', new String[]{
                "**** ",
                "*   *",
                "**** ",
                "*    ",
                "*    "
        });

        map[3] = new CharacterPatternMap('S', new String[]{
                " ****",
                "*    ",
                " *** ",
                "    *",
                "**** "
        });

        return map;
    }

    public static void displayBanner(CharacterPatternMap[] maps) {

        int rows = maps[0].getPattern().length;

        for (int i = 0; i < rows; i++) {
            for (CharacterPatternMap map : maps) {
                System.out.print(map.getPattern()[i] + "  ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        CharacterPatternMap[] maps = createCharacterPatterns();

        displayBanner(maps);
    }
}