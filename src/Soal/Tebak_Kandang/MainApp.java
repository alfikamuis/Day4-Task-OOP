package Soal.Tebak_Kandang;

import Soal.Tebak_Kandang.StyleText.Color;

import java.util.Scanner;

public class MainApp {

    //class kandang
    static Kandang kandang = new Kandang();
    static Kandang_Kambing kambing = new Kandang_Kambing();
    static Kandang_Bebek bebek = new Kandang_Bebek();
    static Kandang_Zebra zebra = new Kandang_Zebra();
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

       while(kandang.getCounter() != jumlahKandang){
           for (int index = 0; index < jumlahKandang; index++) {
               if(kandang.getKandang() == null){
                   kandang.showKandang(index+1);
                   continue;
               }
               String tempHewan = kandang.getKandang().get(index).get(0);
               String tempKondisi = kandang.getKandang().get(index).get(1);
               if(tempKondisi.equalsIgnoreCase("T")){
                   switch (tempHewan){
                       case "K" -> kambing.showKandang("K");
                       case "B" -> bebek.showKandang("B");
                       case "Z" -> zebra.showKandang("Z");
                   }
               } else {
                   kandang.showKandang(index+1);
               }
           }

           //memulai tebakan
           System.out.print("Pilih kandang yang dibuka: ");
           int kandangPilihan = scan.nextInt();
           System.out.println("----Pilihan----");
           Color.showColorText("K: Kambing", "blue");
           Color.showColorText("Z: Zebra", "red");
           Color.showColorText("B: Bebek", "yellow");
           System.out.println("Masukkan tebakan hewan: ");

           String tebakHewan = scan.next();
           tebakHewan.toUpperCase();

           //cek tebakan hewan dan kandang
           if(cekKandang(kandangPilihan,tebakHewan)){ Color.showColorText("Tebakan benar","green");}
           else { Color.showColorText("Tebakan salah!","yellow");}

       }

       scan.close();

    }

    public static boolean cekKandang (int kandangPilihan,String tebakHewan){
        boolean result = false;
        if(kandang.getKandang().get(kandangPilihan).contains(tebakHewan)){
            kandang.getKandang().get(kandangPilihan).set(1,"T");
            kandang.setCounter(kandang.getCounter()+1);
            result = true;
        }
        return result;
    }

    public static boolean cekInput(){
        boolean result = false;
        return result;
    }

}
