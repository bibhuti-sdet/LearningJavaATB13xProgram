package ex_24_OOPS_Abstraction_Abstract_class;

public class Lab197_AB_Cars {
    public static void main(String[] args) {
        WagonR car = new WagonR();
        car.drive();



    }










}

abstract class  Engine{
        abstract void startEngine();
        abstract void stopEngine();
        void checkEngine(){
            System.out.println("Everything is good");
        }
        }
   class WagonR extends Engine{
    @Override
    void startEngine(){
        System.out.println("Strating the car");
    };
        @Override
    void stopEngine(){
            System.out.println("Stopping the car");
    }

    void drive(){
        checkEngine();
        startEngine();
        stopEngine();

    }
    }