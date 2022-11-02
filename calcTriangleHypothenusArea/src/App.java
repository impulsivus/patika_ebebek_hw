import java.io.Console;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Enter the dimensions of the triangle");
        Console console = System.console();

        try {
            double a = Double.parseDouble(console.readLine("a: "));
            double b = Double.parseDouble(console.readLine("b: "));
            double c = Math.sqrt(a * a + b * b);

            double u = (a + b + c) / 2;

            
            System.out.printf("Area: %f\n",Math.sqrt(u * (u - a) * (u - b) * (u - c)));
            System.out.printf("Hypothenus: %f\n",c);            
            
            
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException();
        }
    }
}
