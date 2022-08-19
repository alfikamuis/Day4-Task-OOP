package Soal.Tebak_Kandang;

public class Kandang_Zebra extends Kandang{

    private static final String ANSI_RESET = "\u001B[0m";
    private static final String ANSI_RED = "\u001B[31m";

    Object indexKandang(Object index) {
        return ANSI_RED+"Z"+ANSI_RESET;
    }

    @Override
    public void showKandang(Object index) {
        super.showKandang(index);
    }

}
