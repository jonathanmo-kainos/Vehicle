public class Main {

    public static void main(String[] args) {

        engine engine1 = new engine("Petrol", 250, 3, 2);
	    vehicle vehicle1 = new vehicle("Ford", "Focus", engine1);
        vehicle vehicle2 = new vehicle("Suzuki", "GSX");
        vehicle vehicle3 = new vehicle("Audi", "TT");

        vehicle vehicle4 = new vehicle("BMW", "X5");





        System.out.println(vehicle1.vehicleFullDescription());
        System.out.println(vehicle2.vehicleFullDescription());
        System.out.println(vehicle3.vehicleFullDescription());
        System.out.println(vehicle4.vehicleFullDescription());

        System.out.println(vehicle1.vehicleDescription());

        System.out.println(vehicle1.viewEngine);

        System.out.println(updateEngine());

        System.out.println();

    }
}
