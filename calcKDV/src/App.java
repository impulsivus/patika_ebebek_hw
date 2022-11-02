import java.io.Console;

public class App {
    public static void main(String[] args) throws Exception {
        Console console = System.console();

        try {
            double priceNoKDV = Float.parseFloat(console.readLine("Enter the price without KDV: "));
            System.out.printf("Price without KDV: %f\n", priceNoKDV);
            System.out.printf("Price with KDV: %f\n", priceNoKDV * 1.18);
            System.out.printf("KDV: %f\n", priceNoKDV * 0.18);
            
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException();
        }
    }
}
