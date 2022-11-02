import java.io.Console;

public class App {
    public static void main(String[] args) throws IllegalArgumentException {
        Console console = System.console();
        String height = console.readLine("Lütfen boyunuzu (metre cinsinden) giriniz:");
        String weight = console.readLine("Lütfen kilonuzu giriniz:");

        try {
            float parsedHeight = Float.parseFloat(height);
            float parsedWeight = Float.parseFloat(weight);
            if(parsedHeight <= 0.0f || parsedHeight <= 0.0f) throw new IllegalArgumentException("Geçersiz girdi. Girdiler negatif veya sifir olamaz.");
            System.out.println("Vücut kitle endeksiniz: " + (parsedWeight / (parsedHeight * parsedHeight)));
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Geçersiz girdi. Sorun, virgül yerine nokta kullanmamaniz olabilir.");
        }
    }
}
