package Soal.Vehicle;

public class Buses extends Vehicles{

    private int wheel_count;
    private boolean private_bus;
    String description(){
        if(private_bus){
            return "Buses [Private bus]";
        } else {
            return "Buses [Public bus]";
        }
    }

    public Buses(String name, boolean with_engine, int wheel_count, boolean private_bus) {
        super(name, with_engine);
        this.wheel_count = wheel_count;
        this.private_bus = private_bus;
    }

    @Override
    public void identify_myself() {
        super.identify_myself();
        System.out.print(" I have "+this.wheel_count+" wheel(s)");
    }
}
