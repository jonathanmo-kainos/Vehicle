import java.util.Date;

public class vehicle
{
    private String brand;
    private String model;
    private int wheels;

    public vehicle(String brand, String model, String engine)
    {
        this.brand = brand;
        this.model = model;

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
        return this.brand + " " + this.model;
    }

    private int viewWheels()
    {
        return this.wheels;
    }

}
