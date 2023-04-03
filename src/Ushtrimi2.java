import java.util.Scanner;
public class Ushtrimi2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vendos temperaturen ne grade celcius: ");
        float tempInCelsius = scanner.nextFloat();
        System.out.println("Temperature ne grade ne grade Fahrenheit eshte: " + (1.8 * tempInCelsius + 32.0));
    }
}
