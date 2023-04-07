public class Polymorphism {
    int a;
    int b;

    //no return type with parameter

    static void add(int a,int b){
        System.out.println(a+b);

    }             //int a and int b are parameters
       // System.out.println(a+b);  // public void add() is method




//calling in main method
    public static void main(String[] args) {
        Polymorphism polymorphism = new Polymorphism();//we create object to call in static area from nonstatic
        polymorphism.add(10,20);      //u put 10,20 as value of parameters

    }
}
