package Soal.Animals;

public class Carnivor extends Animal{

    String description(){
        return "Carnivora";
    }
    String jenisMakanan(){
        return getJenisMakanan("Carnivora");
    }

    String gigiBinatang(){
        return getGigiBinatang("Carnivora");
    }
    public Carnivor(String nama) {
        super(nama);
    }
    @Override
    public void identify_myself() {
        super.identify_myself();
    }
}
