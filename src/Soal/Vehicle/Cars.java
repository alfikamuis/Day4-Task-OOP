package Soal.Vehicle;

public class Cars extends Vehicles{

    private int wheel_count;
    private String engine_type;
    String description(){
        return "Cars";
    }

    public Cars(String name, boolean with_engine, int wheel_count, String engine_type) {
        super(name, with_engine);
        this.wheel_count = wheel_count;
        this.engine_type = engine_type;
    }

    @Override
    public void identify_myself() {
        super.identify_myself();
        System.out.print(", I have "+this.wheel_count+" wheel(s)");
        System.out.print(", My engine type = "+this.engine_type);
    }
}
