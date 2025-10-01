public class Main {
    public static void main(String[] args) {
        for (int n = 10; n < 100; n++) {
            String s = Integer.toString(n);
            String rev = new StringBuilder(s).reverse().toString();
            int revNum = Integer.parseInt(rev);

            int sum = (n / 10) + (n % 10);

            if (revNum % 4 == 0 && sum % 6 == 0 && !s.contains("8")) {
                System.out.println(n);
                return;
            }
        }
    }
}
