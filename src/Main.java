public class Main {

    public static void main(String[] args) {

        engine engine1 = new engine("Petrol", 250, 3, 2);
        engine engine2 = new engine("Diesel", 450, 2, 2);
        engine engine3 = new engine("Petrol", 600, 1, 3);
        engine engine4 = new engine("Hybrid", 340, 1, 2);

	    vehicle vehicle1 = new vehicle("Ford", "Focus", engine1);
        vehicle vehicle2 = new vehicle("Suzuki", "GSX", engine2);
        vehicle vehicle3 = new vehicle("Audi", "TT", engine3);

        vehicle vehicle4 = new vehicle("BMW", "X5", engine4);

        System.out.println(vehicle1.vehicleFullDescription());

        vehicle1.updateEngine(engine3);

        System.out.println(vehicle1.vehicleFullDescription());
        //System.out.println(vehicle2.vehicleFullDescription());
        //System.out.println(vehicle3.vehicleFullDescription());
        //System.out.println(vehicle4.vehicleFullDescription());

        //System.out.println(vehicle1.vehicleDescription());
    }
}
