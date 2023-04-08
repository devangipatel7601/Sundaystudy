import java.util.Scanner;

public class LoopMultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any Number: ");
        int a = scanner.nextInt();

        for (int i=1; i<=12; i++ ){
           // System.out.println(i);
            //for (int j=1; j<=12; j++){
            { System.out.println( a+"X"+i+"="+(i*a));
            }
        }
    }
}
