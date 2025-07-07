package ex_25_OOPS_Abstraction_Interface;

import java.lang.classfile.Interfaces;

public class LaB199_Interface {
    public static void main(String[] args) {
        Square s1 = new Square();
        s1.getArea();
    }


 static class Square implements Polygon{

     @Override
     public void getArea(int length, int breadth) {
         System.out.println("Area of Square ->"+3.14 *length*breadth);
     }

     public void getArea() {
     }
 }

}
interface Polygon{
    void getArea( int length, int breadth);
    default void complete(){
        System.out.println("this is possible");
    }
}