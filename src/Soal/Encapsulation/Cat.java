package Soal.Encapsulation;

public class Cat {
    private String fur_color;
    private int num_of_leg;

    public Cat(String fur_color, int num_of_leg) {
        this.fur_color = fur_color;
        this.num_of_leg = num_of_leg;
    }

    public void show_indetity(){
        System.out.print("Saya Kucing dengan detail,");
        System.out.print(", Warna Bulu: "+this.fur_color);
        System.out.println(", dengan jumlah kaki : "+this.fur_color);
    }
}

