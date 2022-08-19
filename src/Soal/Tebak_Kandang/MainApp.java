package Soal.Tebak_Kandang;

import Soal.Tebak_Kandang.StyleText.Color;

import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) {
        //class kandang
        Kandang kandang = new Kandang();

        //buat kandang
        Color.showColorText("\t\t Tebak Kandang", "blue");
        System.out.println("===================================");
        System.out.print("Masukkan jumlah kandang: ");
        Scanner scan = new Scanner(System.in);
        int jumlahKandang = scan.nextInt();

        for (int index = 1; index <= jumlahKandang; index++) {
                kandang.showKandang(index);
        }

        //memulai tebakan
        System.out.print("Pilih kandang yang dibuka: ");
        int kandangPilihan = scan.nextInt();
        System.out.println("----Pilihan----");
        Color.showColorText("K: Kambing", "blue");
        Color.showColorText("Z: Zebra", "red");
        Color.showColorText("B: Bebek", "yellow");
        System.out.println("Masukkan tebakan hewan: ");
        String tebakHewan = scan.nextLine();

        //masukkan tebakan hewan dan kandang di switch case
        switch (kandangPilihan) {
            case 1 -> System.out.println();
            case 2 -> System.out.println();
            case 3 -> System.out.println();
            default -> System.out.println("Error!");
        }

    }
}
