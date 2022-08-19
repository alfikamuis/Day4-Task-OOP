package Soal.Tebak_Kandang;

import java.util.ArrayList;
import java.util.Random;

public class Kandang {
    private int counter = 0;
    private int jumlahKandang;
    private final static String[] hewan = {"K","Z","B"};
    private ArrayList<ArrayList<String>> kandang;

    //meletakkan hewan secara random pada jumlah kandang yang disediakan
    public void randomKandangHewan(){
        this.kandang = new ArrayList<ArrayList<String>>(this.jumlahKandang);
        Random rand = new Random();
        for(int index= 0 ; index < this.jumlahKandang; index++){
            ArrayList<String> temp = new ArrayList<>(2);
            temp.add(this.hewan[rand.nextInt(this.hewan.length)]);
            temp.add("F");
            this.kandang.add(temp);
        }
        //System.out.println(kandang);
        //System.out.println(kandang.get(0).get(0));
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter += counter;
    }

    public void setJumlahKandang(int jumlahKandang) {
        this.jumlahKandang = jumlahKandang;
    }

    public ArrayList<ArrayList<String>> getKandang() {
        return kandang;
    }

    Object indexKandang(Object index){
        return index;
    }

    public void showKandang(Object index){
        System.out.println("|||");
        System.out.printf("|%s|\n", indexKandang(index));
        System.out.println("|||\n");
    }

}
