public class Main {
    public static void main(String[] args) {
            Car car = new Car("HONDA", 4);
            Car car2 = new Car("TOYOTA", 4);
//            car.modelName = "car1";
//            car2.modelName = "car2";
//            car.wheelsCount = 4;
//            car2.wheelsCount = 4;

            Truck truck = new Truck("KIA", 6);
            Truck truck2 = new Truck("VOLVO", 8);
//            truck.modelName = "truck1";
//            truck2.modelName = "truck2";
//            truck.wheelsCount = 6;
//            truck2.wheelsCount = 8;

//            Bicycle [] bicycles = {
//                    new Bicycle("Kona", 2),
//                    new Bicycle("Scott", 2)
//            };
            Bicycle bicycle = new Bicycle("Kona", 2);
            Bicycle bicycle2 = new Bicycle("Scott", 2);
//            bicycle.modelName = "bicycle1";
//            bicycle2.modelName = "bicycle2";
//            bicycle.wheelsCount = 2;
//            bicycle2.wheelsCount = 2;

            ServiceStation station = new ServiceStation();
            station.check(car);
            station.check(car2);
            station.check( bicycle);
            station.check( bicycle2);
            station.check(truck);
            station.check(truck2);
        }
    }