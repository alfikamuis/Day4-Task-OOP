package Soal.Tebak_Kandang;

public class Kandang_Bebek extends Kandang{

    private static final String ANSI_RESET = "\u001B[0m";
    private static final String ANSI_YELLOW = "\u001B[33m";

    Object indexKandang(Object index) {
        return ANSI_YELLOW+"B"+ANSI_RESET;
    }

    @Override
    public void showKandang(Object index) {
        super.showKandang(index);
    }

}
