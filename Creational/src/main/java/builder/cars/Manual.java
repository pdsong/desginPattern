package builder.cars;

import builder.components.Engine;
import builder.components.GPSNavigator;
import builder.components.Transmission;
import builder.components.TripComputer;

public class Manual {
    private final Type type;
    private final int seats;
    private final Engine engine;
    private final Transmission transmission;
    private final TripComputer tripComputer;
    private final GPSNavigator gpsNavigator;

    public Manual(Type type, int seats, Engine engine, Transmission transmission, TripComputer tripComputer, GPSNavigator gpsNavigator) {
        this.type = type;
        this.seats = seats;
        this.engine = engine;
        this.transmission = transmission;
        this.tripComputer = tripComputer;
        this.gpsNavigator = gpsNavigator;
    }

    @Override
    public String toString() {
        String info = "";
        info += "type=" + type;
        info += ", seats=" + seats;
        info += ", engine=" + engine;
        info += ", transmission=" + transmission;
        if (this.tripComputer != null) {
            info += "trip computer:Functional";
        } else {
            info += "trip computer:N/A";
        }
        if (this.gpsNavigator != null) {
            info += "GPS Navigator:Functional";
        } else {
            info += "GPS Navigator:N/A";
        }
        return info;
    }
}
