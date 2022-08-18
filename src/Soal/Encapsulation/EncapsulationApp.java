package Soal.Encapsulation;

public class EncapsulationApp {
    public static void main(String[] args) {
        Cat kucing = new Cat("hitam",4);
        Fish ikan = new Fish("paus","cacing");
        Flower bunga = new Flower("mawar","merah merona",8);
        Car mobil = new Car("MPV","gold",4) ;

        kucing.show_indetity();
        ikan.show_indetity();
        bunga.show_indetity();
        mobil.show_indetity();
    }

}
