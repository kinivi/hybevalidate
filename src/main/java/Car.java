import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Car {

    @NotNull
    private String manufacturer;

    @NotNull
    @Size(min = 2, max = 14)
    private String licensePlate;

    @NotNull
    private Person driver;

    @Min(2)
    private int seatCount;

    public Car(String manufacturer, String licensePlate, Person driver, int seatCount) {
        this.manufacturer = manufacturer;
        this.licensePlate = licensePlate;
        this.driver = driver;
        this.seatCount = seatCount;
    }

    public Car(String manufacturer, String licencePlate, int seatCount) {
        this.manufacturer = manufacturer;
        this.licensePlate = licencePlate;
        this.seatCount = seatCount;
    }

    //getters and setters ...
}