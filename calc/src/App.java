import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        double first;
        double second;

        Scanner s = new Scanner(System.in);
        System.out.println("Please enter the first number:");
        first = s.nextDouble();
        System.out.println("Please enter the second number:");
        second = s.nextDouble();
        System.out.println("Please select a mode:");
        System.out.println("1 - Add\n2 - Substract\n3 - Multiply\n4 - Divide");
        switch (s.nextInt()) {
            case 1:
                System.out.printf("Result : %f\n", first + second);
                break;
            case 2:
                System.out.printf("Result : %f\n", first - second);
                break;
            case 3:
                System.out.printf("Result : %f\n", first * second);
                break;
            case 4:
                if (second == 0) {
                    System.out.println("Can not divide by zero");
                    break;
                }
                System.out.printf("Result : %f\n", first / second);
                break;
        }
    }
}
