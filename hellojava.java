import java.util.Scanner;
public class hellojava {
    public static void main(String[] args) {
        Scanner vy = new Scanner(System.in);
        ;System.out.print(" Tớ tên là : ");
        String name = vy.nextLine();
        System.out.println("Hello " + name);
    }
}