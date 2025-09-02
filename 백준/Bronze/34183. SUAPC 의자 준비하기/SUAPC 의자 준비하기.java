import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        
        int need = 3 * N;
        int lack = Math.max(0, need - M);
        
        if (lack == 0) {
            System.out.println(0);
        } else {
            System.out.println(lack * A + B);
        }
    }
}
