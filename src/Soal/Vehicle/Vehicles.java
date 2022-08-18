package Soal.Vehicle;

public class Vehicles {
    private String name;
    private boolean with_engine;

    String description(){
        return "parent of All vehicles";
    }

    String engine(boolean with_engine){
        if (with_engine){
            return ", My engine status is 'With engine',";
        }
        else {
            return ", My engine status is 'no engine',";
        }
    }
    public Vehicles(String name, boolean with_engine) {
        this.name = name;
        this.with_engine = with_engine;
    }

    public void identify_myself(){
        System.out.println();
        System.out.print("Hi i'm "+ description());
        System.out.print(" ,My name is "+ this.name);
        System.out.print(engine(this.with_engine));
    }
}
