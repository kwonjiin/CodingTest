import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        int a = A, b = B;
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }

        int gcd = a;
        int lcm = (A * B) / gcd;

        System.out.println(gcd);
        System.out.println(lcm);
    }
}
