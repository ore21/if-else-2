import java.util.Scanner;
public class main {

    public static void main(String[] args) {
        int value = 0;
        int answer = 104;
        Scanner scanner = new Scanner(System.in);


            System.out.println("Enter a number between 92.0 and 104.0: ");

            value = scanner.nextInt();

            //int value = Math.abs(guess - answer);


            if (value < 97.5) {
                System.out.println(" Low " );
            }

            if ((value <= 99.5) &&  (value >= 97.5)) {
                    System.out.println(" Normal " );
            }

            if (value > 99.5) {
                        System.out.println(" High " );
            }
            System.out.println(" The weather that you entered is: " +  value + " Degrees.");

    }

}

