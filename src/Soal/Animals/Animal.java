package Soal.Animals;

public class Animal {
    private String nama;
    private String jenisMakanan;
    private String gigiBinatang;

    String description(){
      return "parent of all animal";
    }

    String jenisMakanan(){
        return "";
    }

    String gigiBinatang(){
        return "";
    }
    public String getJenisMakanan(String type) {
        if(type == "Herbivora"){this.jenisMakanan = ", My food is "+"tumbuhan";};
        if(type == "Carnivora"){this.jenisMakanan = ", My food is "+"daging";};
        if(type == "Omnivora"){this.jenisMakanan = ", My food is "+"semua";};
        return jenisMakanan;
    }

    public String getGigiBinatang(String type) {
        if(type == "Herbivora"){this.gigiBinatang = ", I have "+"tumpul"+" teeth";};
        if(type == "Carnivora"){this.gigiBinatang = ", I have "+"tajam"+" teeth";};
        if(type == "Omnivora"){this.gigiBinatang = ", I have "+"tumpul dan tajam"+" teeth";};
        return gigiBinatang;
    }

    public Animal(String nama) {
        this.nama = nama;
    }

    public Animal(String nama, String jenisMakanan, String gigiBinatang) {
        this.nama = nama;
        this.jenisMakanan = jenisMakanan;
        this.gigiBinatang = gigiBinatang;
    }

    public void identify_myself(){
        System.out.println();
        System.out.print("Hi i'm "+ description());
        System.out.print(" ,My name is "+ this.nama);
        System.out.print(jenisMakanan());
        System.out.print(gigiBinatang());
    }
}
