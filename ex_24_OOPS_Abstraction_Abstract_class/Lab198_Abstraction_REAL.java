package ex_24_OOPS_Abstraction_Abstract_class;

public class Lab198_Abstraction_REAL {
    public static void main(String[] args) {
        //Employee c2 = new Employee(); not allowed
        Company c1 = new Company();
        c1.computePay();
    }


}

 class Company extends Employee{


     @Override
     double computePay() {
         return 1000;
     }
 }
abstract class Employee{
        private String name;
        private String address;
        private int number;
    Employee(){
        System.out.println("DC");
    }
    Employee( String name,String address, int number){

        System.out.println( " construting an Employee");
        this.name = name;
        this.address = address;
        this.number = number;
    }
    abstract double computePay();
    void mailchek(){

        System.out.println("mailing a check to"+this.name+ "  "+this.address);
    }
}