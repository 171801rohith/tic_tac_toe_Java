import java.util.Scanner;

public class input {
    char inX;
    char inO;

    public char getInX() {
        Scanner sc1 = new Scanner(System.in);
        System.out.print(" For X :Enter a number which is only shown in board :");
        inX = sc1.next().charAt(0);
        return inX;
    }

    public char getInO() {
        Scanner sc = new Scanner(System.in);
        System.out.print(" For O :Enter a number which is only shown in board :");
        inO = sc.next().charAt(0);
        return inO;
    }
}
