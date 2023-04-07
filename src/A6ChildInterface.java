public class A6ChildInterface implements  PrintableParentInterface
{
    public void Print() {
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        A6ChildInterface a6ChildInterface= new A6ChildInterface();
        a6ChildInterface.Print();

    }
}
