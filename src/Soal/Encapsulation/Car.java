package Soal.Encapsulation;

public class Car {
    private String type;
    private String color;
    private int num_of_tire;

    public Car(String type, String color, int num_of_tire) {
        this.type = type;
        this.color = color;
        this.num_of_tire = num_of_tire;
    }

    public void show_indetity(){
        System.out.print("Saya Bunga dengan detail,");
        System.out.print(" Jenis: "+this.type);
        System.out.print(", color : "+this.color);
        System.out.println(", num of petal: "+this.num_of_tire);
    }
}
