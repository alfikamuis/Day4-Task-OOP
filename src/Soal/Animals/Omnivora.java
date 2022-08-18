package Soal.Animals;

public class Omnivora extends Animal{
    String description(){
        return "Omnivora";
    }

    String jenisMakanan(){
        return getJenisMakanan("Omnivora");
    }

    String gigiBinatang(){
        return getGigiBinatang("Omnivora");
    }
    public Omnivora(String nama) {
        super(nama);
    }

    @Override
    public void identify_myself() {
        super.identify_myself();
    }

}
