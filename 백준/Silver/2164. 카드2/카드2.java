import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        Deque<Integer> queue = new ArrayDeque<>();
        for (int i = 1; i <= N; i++) {
            queue.offer(i); // 카드 초기화
        }

        while (queue.size() > 1) {
            queue.poll();           // 위 카드 제거
            queue.offer(queue.poll()); // 다음 카드 아래로 이동
        }

        System.out.println(queue.peek());
    }
}
