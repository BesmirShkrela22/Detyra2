import java.util.Scanner;
public class Ushtrimi5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vendos numrin :" );
        int nr = scanner.nextInt();
        if (nr % 5 == 0){
            System.out.println("Numri eshte perpjestues me 5");
        }else {
            System.out.println("Numri nuk eshte perpjestues me 5");
        }
    }
}
