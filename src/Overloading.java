public class Overloading {    //method for overloading
   // no return type with parameter
    void add(int x,int y)          //method 1
    {
        System.out.println(x+y);

    }
    //no return type with 3 parameters
    void add(int x,int y,int z)
    {    //we create method with same name but add extra z parameter
        System.out.println(x+y+z);
    }

    public static void main(String[] args) {
        //creating class object to call non-static method into static area
        Overloading overloading= new Overloading();

        //calling method using class object/
        overloading.add(20,30);
        overloading.add(20,30,40);
    }

//   static void add(){
//        int a=10;
//        int b=20;
//        System.out.println(a+b);

//    }
//    //no return type with parameter
//   static void add(int a, int b){
//        System.out.println(a+b);
//    }
//
//    public static void main(String[] args) {
//
//        add(20,30);
//        add(10,10);
//        add(0,10);
//    }
}
