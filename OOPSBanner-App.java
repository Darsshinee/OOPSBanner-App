public class OOPSBanner-App {

    public static String[] getOPattern() {
        return new String[]{
            "   ***  ",
            " **   **",
            "**     **",
            "**     **",
            "**     **",
            " **   ** ",
            "   ***  "
        };
    }

    public static String[] getPPattern() {
        return new String[]{
            " ***** ",
            " **  **",
            " **  **",
            " ***** ",
            " **    ",
            " **    ",
            " **    "
        };
    }

    public static String[] getSPattern() {
        return new String[]{
            " ***** ",
            " **    ",
            " **    ",
            " ***** ",
            "    **",
            "    **",
            " ***** "
        };
    }

    public static void main(String[] args) {

        String[] o1 = getOPattern();
        String[] o2 = getOPattern();
        String[] p = getPPattern();
        String[] s = getSPattern();

        int i = 0;

        for (String line : o1) {
            System.out.println(String.join(" ",
                    o1[i],
                    o2[i],
                    p[i],
                    s[i]
            ));
            i++;
        }
    }
}