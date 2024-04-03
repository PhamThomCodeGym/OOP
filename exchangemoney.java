import java.util.Scanner;
public class exchangemoney {

        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.println("Nhập số tiền USD : ");
                double vnd = 23.000;
                double usd;
                usd = sc.nextDouble();
                double value = usd *23.000;
                System.out.println( "Giá trị VND :" +value );
        }
    }