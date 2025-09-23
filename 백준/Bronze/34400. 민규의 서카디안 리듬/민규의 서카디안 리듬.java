import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            long t = sc.nextLong();
            long mod = t % 25;
            
            if (mod < 17) {
                System.out.println("ONLINE");
            } else {
                System.out.println("OFFLINE");
            }
        }
    }
}
