import java.util.Scanner;

public class MyCalcApp {
    public static void main(String[] args) {
        System.out.println("Enter Integer:");
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        Calculator calculator = new Calculator();
        try {
            double doubleNum =calculator.caldouble(number);
            System.out.println("Double of "+ number +" is "+ doubleNum);
        }
     catch (MyArithException ex){
         System.out.println(ex.getMessage());
     }
        scanner.close();
    }
}
