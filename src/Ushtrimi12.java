import java.util.Scanner;
public class Ushtrimi12 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Vendosni sekondat: ");
        int userInput = in.nextInt();
        int seconds = userInput % 60;
        int hours = userInput / 60;
        int minutes = hours % 60;
        hours = hours / 60;
        System.out.print( hours + ":" + minutes + ":" + seconds);
        System.out.print("\n");
    }
}
