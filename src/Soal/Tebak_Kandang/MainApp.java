package Soal.Tebak_Kandang;

import Soal.Tebak_Kandang.StyleText.Color;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class MainApp {

    //class kandang
    static Kandang kandang = new Kandang();
    static Kandang_Kambing kambing = new Kandang_Kambing();
    static Kandang_Bebek bebek = new Kandang_Bebek();
    static Kandang_Zebra zebra = new Kandang_Zebra();
    private static HashSet<Integer> kunciKandang = new HashSet<>();

    public static void main(String[] args) {


        //buat kandang
        Color.showColorText("\t\t Tebak Kandang", "blue");
        System.out.println("===================================");
        System.out.print("Masukkan jumlah kandang: ");
        Scanner scan = new Scanner(System.in);
        int jumlahKandang = scan.nextInt();

        //kandang execute
        kandang.setJumlahKandang(jumlahKandang);
        kandang.randomKandangHewan();

       while(kandang.getCounter() <= jumlahKandang){
           for (int index = 1; index <= jumlahKandang; index++) {
               if(kandang.getKandang() == null){
                   kandang.showKandang(index);
                   continue;
               }
               String tempHewan = kandang.getKandang().get(index-1).get(0);
               String tempKondisi = kandang.getKandang().get(index-1).get(1);
               if(tempKondisi.equalsIgnoreCase("T")){
                   switch (tempHewan){
                       case "K" -> kambing.showKandang("K");
                       case "B" -> bebek.showKandang("B");
                       case "Z" -> zebra.showKandang("Z");
                   }
               } else {
                   kandang.showKandang(index);
               }
           }

           //memulai tebakan
           System.out.print("Pilih kandang yang akan dibuka: ");
           int kandangPilihan = scan.nextInt();
           while(kandangPilihan > jumlahKandang || kandangPilihan <= 0){
               System.out.print("Kandang tidak tersedia,pilih lagi: ");
               kandangPilihan = scan.nextInt();
           }

           //cek apakah kandang sudah pernah dibuka?
           while(kunciKandang.contains(kandangPilihan)){
               Color.showColorText("Kandang sudah dibuka, masukkan pilihan lain","yellow");
               System.out.print("\nPilih kandang yang belum: ");
               kandangPilihan = scan.nextInt();
           }

           System.out.println("----Pilihan----");
           Color.showColorText("K: Kambing", "blue");
           Color.showColorText("Z: Zebra", "red");
           Color.showColorText("B: Bebek", "yellow");

           //tebakan hewan
           System.out.print("Masukkan tebakan hewan: ");
           String tebakHewan = scan.next();
           tebakHewan = tebakHewan.toUpperCase();
           while(
                   !tebakHewan.equalsIgnoreCase("K") &&
                   !tebakHewan.equalsIgnoreCase("Z") &&
                   !tebakHewan.equalsIgnoreCase("B")
           ){
               System.out.print("pilih (k,z,b): ");
               tebakHewan = scan.next();
               tebakHewan = tebakHewan.toUpperCase();
           }

           //cek tebakan hewan dan kandang
           if(cekKandang(kandangPilihan-1,tebakHewan)){ Color.showColorText("Tebakan benar","green");}
           else { Color.showColorText("Tebakan salah!","yellow");}

           //wining text
           if(kandang.getCounter() > jumlahKandang){
               Color.showColorText("Anda Menang..... isss !","green");
           }
       }

       scan.close();
    }

    public static boolean cekKandang (int kandangPilihan,String tebakHewan){
        boolean result = true;
        if(kandang.getKandang().get(kandangPilihan).get(0).contains(tebakHewan)){
            kandang.getKandang().get(kandangPilihan).set(1,"T");
            kandang.setCounter(kandang.getCounter()+1);
            kunciKandang.add(kandangPilihan+1);
        } else { result = false;}

        //debug show cheat
        //System.out.println(kandang.getKandang());
        return result;
    }


}
