public class Car {

    String comapny = "Ford";
    String model = "Mustang";
    int year = 1999;
    double price = 8500000.72;
    boolean isRunning = false;

    void start(){
        isRunning = true;
        System.out.println("You started the "+ model);
    }

    void drive(){
        isRunning = true;
        System.out.println("You're driving the "+ model);
    }

    void stop(){
        isRunning = false;
        System.out.println("You stopped the "+model);
    }
}
