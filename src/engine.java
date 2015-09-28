import java.util.Date;

public class engine {

    private String fuelType;
    private int capacity;
    private int width;
    private int height;

    public engine(String fuelType, int capacity, int width, int height)
    {
        this.fuelType = fuelType;
        this.capacity = capacity;
        this.width = width;
        this.height = height;
    }

    public String viewEngine()
    {
        return this.fuelType + " " + this.capacity + " " + this.width + " " + this.height;
    }

    public void updateEngine()
    {
        Date date = new Date();
        System.out.println(date);

    }
}
