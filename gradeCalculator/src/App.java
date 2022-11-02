import java.io.Console;

public class App {
    public static void main(String[] args) throws Exception {
        Console console = System.console();

        try {
            float math = Float.parseFloat(console.readLine("Math score: "));
            float physics = Float.parseFloat(console.readLine("Physics score: "));
            float chemistry = Float.parseFloat(console.readLine("Chemistry score: "));
            float english = Float.parseFloat(console.readLine("English score: "));
            float history = Float.parseFloat(console.readLine("History score: "));
            float music = Float.parseFloat(console.readLine("Music score: "));

            boolean didPass = (math + physics + chemistry + english + history + music) / 6 >= 60;


            // Would be better with a function, but even using "if-else" statments is not allowed, this should work too...
            while (didPass) {
                System.out.println("Passed the class");
                break;
            }
            while (!didPass) {
                System.out.println("Failed to pass the class");
                break;
            }
            
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException();
        }
    }
}
