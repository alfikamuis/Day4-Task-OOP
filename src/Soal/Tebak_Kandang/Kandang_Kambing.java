package Soal.Tebak_Kandang;

public class Kandang_Kambing extends Kandang{

    private static final String ANSI_RESET = "\u001B[0m";
    private static final String ANSI_BLUE = "\u001B[34m";

    Object indexKandang(Object index) {
        return ANSI_BLUE+"K"+ANSI_RESET;
    }

    @Override
    public void showKandang(Object index) {
        super.showKandang(index);
    }
}
