package Soal.Encapsulation;

public class Flower {
    private String nama;
    private String color;
    private int num_of_petal;

    public Flower(String nama, String color, int num_of_petal) {
        this.nama = nama;
        this.color = color;
        this.num_of_petal = num_of_petal;
    }

    public void show_indetity(){
        System.out.print("Saya Bunga dengan detail,");
        System.out.print(" Jenis: "+this.nama);
        System.out.print(", color : "+this.color);
        System.out.println(", num of petal: "+this.num_of_petal);
    }
}
