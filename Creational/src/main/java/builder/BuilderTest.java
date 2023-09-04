package builder;


import builder.builders.CarBuilder;
import builder.builders.CarManualBuilder;
import builder.cars.Car;
import builder.cars.Manual;
import builder.director.Director;


public class BuilderTest {
    public static void main(String[] args) {
        Director director=new Director();
        CarBuilder carBuilder=new CarBuilder();
        director.constructSportsCar(carBuilder);
        Car car=carBuilder.getResult();
        System.out.println(car.toString());

        CarManualBuilder carManualBuilder=new CarManualBuilder();
        director.constructSportsCar(carManualBuilder);
        Manual carManual=carManualBuilder.getResult();
        System.out.println(carManual);
    }
}
