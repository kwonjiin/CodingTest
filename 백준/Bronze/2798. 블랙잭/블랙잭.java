import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt(); // 카드 개수
        int M = sc.nextInt(); // 목표 값
        int[] cards = new int[N];
        
        for (int i = 0; i < N; i++) {
            cards[i] = sc.nextInt();
        }
        
        int answer = 0;
        
        // 3중 for문으로 모든 조합 확인
        for (int i = 0; i < N - 2; i++) {
            for (int j = i + 1; j < N - 1; j++) {
                for (int k = j + 1; k < N; k++) {
                    int sum = cards[i] + cards[j] + cards[k];
                    
                    if (sum <= M && sum > answer) {
                        answer = sum; // M을 넘지 않으면서 가장 큰 값 갱신
                    }
                }
            }
        }
        
        System.out.println(answer);
    }
}
