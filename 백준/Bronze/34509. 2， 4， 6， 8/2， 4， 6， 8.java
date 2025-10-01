public class Main {
    public static void main(String[] args) {
        for (int n = 10; n < 100; n++) {
            int a = n / 10, b = n % 10; // a: 십의 자리, b: 일의 자리
            int rev = b * 10 + a;
            int sum = a + b;

            if (rev % 4 == 0 && sum % 6 == 0 && a != 8 && b != 8) {
                System.out.println(n);
                return;
            }
        }
    }
}