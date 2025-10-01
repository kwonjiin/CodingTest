public class Main {
    public static void main(String[] args) {
        int[] candidates = {15, 24, 33, 42, 51, 60, 69, 96};
        for (int n : candidates) {
            int a = n / 10, b = n % 10;
            int rev = b * 10 + a;
            int sum = a + b;

            if (rev % 4 == 0 && sum % 6 == 0 && a != 8 && b != 8) {
                System.out.println(n);
                return;
            }
        }
    }
}