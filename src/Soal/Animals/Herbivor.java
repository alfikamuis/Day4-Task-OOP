package Soal.Animals;

public class Herbivor extends Animal{
    String description(){
        return "Herbivora";
    }

    String jenisMakanan(){
        return getJenisMakanan("Herbivora");
    }

    String gigiBinatang(){
        return getGigiBinatang("Herbivora");
    }

    public Herbivor(String nama) {
        super(nama);
    }

    @Override
    public void identify_myself() {
        super.identify_myself();
    }
}
