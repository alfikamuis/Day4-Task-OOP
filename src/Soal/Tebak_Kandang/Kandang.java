package Soal.Tebak_Kandang;

import java.util.ArrayList;

public class Kandang {

    private int jumlahKandang;

    Object indexKandang(Object index){
        return index;
    }

    public void showKandang(Object index){
        System.out.println("|||");
        System.out.printf("|%s|\n", indexKandang(index));
        System.out.println("|||\n");
    }
}
