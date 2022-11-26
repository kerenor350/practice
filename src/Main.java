import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
       do{
           System.out.println("Enter a number");
           number = scanner.nextInt();
           if ( number <100 && number >= 10 ){;
               System.out.println ( "The digit is " + number/10  );
       }

        }while (! ( number <100 && number >= 10 ) );
    }
}