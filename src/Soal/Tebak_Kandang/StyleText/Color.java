package Soal.Tebak_Kandang.StyleText;

public class Color {
    private final static String ANSI_RESET = "\u001B[0m";
    private final static String ANSI_BLUE = "\u001B[34m";
    private final static String ANSI_RED = "\u001B[31m";
    private final static String ANSI_YELLOW = "\u001B[33m";
    public static void showColorText(String text, String color) {
        if (color == "red") {System.out.println(ANSI_RED + text + ANSI_RESET);}
        if (color == "blue") {System.out.println(ANSI_BLUE + text + ANSI_RESET);}
        if (color == "yellow") {System.out.println(ANSI_YELLOW + text + ANSI_RESET);}
    }
}
