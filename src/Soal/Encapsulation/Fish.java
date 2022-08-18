package Soal.Encapsulation;

public class Fish {
    private String type;
    private String feed;

    public Fish(String type, String feed) {
        this.type = type;
        this.feed = feed;
    }

    public void show_indetity(){
        System.out.print("Saya Ikan dengan detail,");
        System.out.print(" Jenis: "+this.type);
        System.out.println(" makanan : "+this.feed);
    }
}
