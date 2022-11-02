import java.io.Console;

public class App {
    public static void main(String[] args) throws IllegalArgumentException {
        double armutPrice = 2.14;
        double elmaPrice = 3.67;
        double domatesPrice = 1.11;
        double muzPrice = 0.95;
        double patlicanPrice = 5.00;

        Console console = System.console();
        String armut = console.readLine("Armut (kg):");
        String elma = console.readLine("Elma (kg):");
        String domates = console.readLine("Domates (kg):");
        String muz = console.readLine("Muz (kg):");
        String patlican = console.readLine("Patlican (kg):");
        try {
            float parsedArmut = Float.parseFloat(armut);
            float parsedElma = Float.parseFloat(elma);
            float parsedDomates = Float.parseFloat(domates);
            float parsedMuz = Float.parseFloat(muz);
            float parsedPatlican = Float.parseFloat(patlican);
            if (parsedArmut < 0.0f || parsedElma < 0.0f || parsedDomates < 0.0f || parsedMuz < 0.0f
                    || parsedPatlican < 0.0f)
                throw new IllegalArgumentException("Agirliklar sifirdan küçük olamaz.");

            double totalPrice = parsedArmut * armutPrice
                    + parsedElma * elmaPrice
                    + parsedDomates * domatesPrice
                    + parsedMuz * muzPrice
                    + parsedPatlican * patlicanPrice;

            System.out.printf("Toplam tutar: %f", totalPrice);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Geçersiz girdi. Sorun, virgül yerine nokta kullanmamaniz olabilir.");
        }
    }
}
