import java.util.*;
public class Main {
    public static void main(String[] args){

        Car car = new Car();

        System.out.println(car.comapny +" "+ car.model);
        System.out.println(car.year + " Edition for ₹."+ car.price);

        System.out.println("car running status: "+car.isRunning);
        car.start();
        System.out.println("car running status: "+car.isRunning);
        car.drive();
        System.out.println("car running status: "+car.isRunning);
        car.stop();
        System.out.println("car running status: "+car.isRunning);
    }
}
