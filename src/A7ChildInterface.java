public class A7ChildInterface implements DrawableParentIneterface, ShowableParentInterface
{
     //child class for multiple Inheritance via Interface


    public void draw() {
        System.out.println("Hello");
    }


    public void show() {
        System.out.println("Welcome");

    }

    public static void main(String[] args) {
        A7ChildInterface a7ChildInterface = new A7ChildInterface();
        a7ChildInterface.draw();
        a7ChildInterface.show();

    }
}
