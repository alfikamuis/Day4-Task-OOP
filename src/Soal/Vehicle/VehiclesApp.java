package Soal.Vehicle;

public class VehiclesApp {
    public static void main(String[] args) {
        Vehicles kendaraan = new Vehicles("gerobak",false);
        Bikes sepeda = new Bikes("pedal bikes",false,2);
        Bikes sepeda2 = new Bikes("motor bikes",true,2);
        Buses bis1 = new Buses("trans jakarta",true,4,false);
        Buses bis2 = new Buses("school bus",true,4,true);
        Cars mobil1 = new Cars("sport car",true,4,"v8");
        Cars mobil2 = new Cars("pickup car",true,4,"solar");

        //parent
        kendaraan.identify_myself();
        //child
        System.out.println();
        sepeda.identify_myself();
        sepeda2.identify_myself();
        //child
        System.out.println();
        mobil1.identify_myself();
        mobil2.identify_myself();
        //child
        System.out.println();
        bis1.identify_myself();
        bis2.identify_myself();

    }
}
