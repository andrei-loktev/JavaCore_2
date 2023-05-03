import com.sun.jdi.connect.spi.TransportService;

public class Main {
    public static void main(String[] args) {
            Car car = new Car("HONDA", 4);
            Car car2 = new Car("TOYOTA", 4);

            Truck truck = new Truck("KIA", 6);
            Truck truck2 = new Truck("VOLVO", 8);

            Bicycle bicycle = new Bicycle("Kona", 2);
            Bicycle bicycle2 = new Bicycle("Scott", 2);

            Transport[] transports = {car, car2, bicycle, bicycle2, truck, truck2};

            ServiceStation station = new ServiceStation();
            for (Transport transport: transports){
                System.out.println(transport.getModelName());
                station.check(transport);
                System.out.println();
            }

//            station.check(car);
//            station.check(car2);
//            station.check( bicycle);
//            station.check( bicycle2);
//            station.check(truck);
//            station.check(truck2);
        }
    }