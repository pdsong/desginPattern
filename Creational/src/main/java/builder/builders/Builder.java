package builder.builders;

import builder.cars.Type;
import builder.components.Engine;
import builder.components.GPSNavigator;
import builder.components.Transmission;
import builder.components.TripComputer;

public interface Builder {
    void setType(Type type);

    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTripComputer(TripComputer tripComputer);
    void setTransmission(Transmission transmission);

    void setGPSNavigator(GPSNavigator gpsNavigator);

}
