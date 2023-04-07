import java.util.Scanner;

public class LoopMultiplicationTable {
    //creating scanner class object

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //acknowledge user to input
        System.out.println("Enter any Number: ");

        //create variable using scanner object
        int a = scanner.nextInt();

        for (int i=1; i<=12; i++ ){

           //for printing multiplication
            { System.out.println( a+" X "+ i +" = "+ (i*a));
            }
        }
    }
}
