import java.util.Date;

public class vehicle
{
    private String brand;
    private String model;
    private int wheels;
    private engine engine;

    public vehicle(String brand, String model, engine engine)
    {
        this.brand = brand;
        this.model = model;
        this.engine = engine;

        if (brand == "Suzuki" && model == "GSX")
        {
            wheels = 2;
        }
        else
        {
            wheels = 4;
        }

    }

    public String vehicleDescription()
    {
        return this.brand + " " + this.model;
    }

    public String vehicleFullDescription()
    {
        return this.brand + " " + this.model + " " + engine;
    }

    private int viewWheels()
    {
        return this.wheels;
    }

    public engine updateEngine(engine engine)
    {
        Date date = new Date();
        System.out.println(date);
        return engine;
    }

}
