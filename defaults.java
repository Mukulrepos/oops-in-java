class Car {
    String car_name;
    String car_state;

    Car(String car, String car_states) {
        this.car_name = car;
        this.car_state = car_states;
        System.out.println("Hello, this is my car: " + car_name);
    }

    public static String cars_start(String state) {
        System.out.println("Car is " + state);
        return state;
    }

    public String car_run(String car_state) {
        System.out.println("Car is running: " + car_state);
        return car_state;
    }

    public String car_stop(String car_stopped) {
        System.out.println("Car is stopped: " + car_stopped);
        return car_stopped;
    }
}

public class defaults {
    public static void main(String[] args) {
        // Creating a car object
        Car honda = new Car("Honda Civic", "running");

        // Testing the methods
        Car.cars_start("started");
        honda.car_run(honda.car_state);
        honda.car_stop("stopped");
    }
}
