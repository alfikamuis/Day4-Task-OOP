package Soal.Vehicle;

public class Bikes extends Vehicles{

    private int wheel_count;
    String description(){
        return "Bikes";
    }

    public Bikes(String name, boolean with_engine, int wheel_count) {
        super(name, with_engine);
        this.wheel_count = wheel_count;
    }

    @Override
    public void identify_myself() {
        super.identify_myself();
        System.out.print(" I have "+this.wheel_count+" wheel(s)");
    }
}
