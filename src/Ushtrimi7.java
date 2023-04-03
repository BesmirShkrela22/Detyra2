import java.util.Scanner;
public class Ushtrimi7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Vendosni numrin e pare: ");
        int firstNum = in.nextInt();
        System.out.print("Vendosni numrin e dyte: ");
        int secondNum = in.nextInt();
        System.out.println(firstNum + " + " + secondNum + " = " +
                (firstNum + secondNum));
        System.out.println(firstNum + " - " + secondNum + " = " +
                (firstNum - secondNum));
        System.out.println(firstNum + " x " + secondNum + " = " +
                (firstNum * secondNum));
        System.out.println(firstNum + " / " + secondNum + " = " +
                (firstNum / secondNum));
        System.out.println(firstNum + " % " + secondNum + " = " +
                (firstNum % secondNum));
    }

}
