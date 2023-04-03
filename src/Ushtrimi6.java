import java.util.Scanner;
public class Ushtrimi6 {
    public static void main(String[] strings) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vendos Gjatesine:" );
        double height = scanner.nextDouble();
        System.out.println("Vendos Gjeresine:" );
        double width = scanner.nextDouble();
        double perimeter = 2*(height + width);
        double area = width * height;
        System.out.println("Perimentri i drejtkendeshit  eshte  " + perimeter);
        System.out.println("Siperfaqa e drejkendeshit eshte " + area);
    }
}
