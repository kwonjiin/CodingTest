import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] cards = new int[N];

        for (int i = 0; i < N; i++) {
            cards[i] = sc.nextInt();
        }

        Arrays.sort(cards); // 정렬
        int result = 0;

        // 2장 뽑고, 남은 1장은 이진 탐색
        for (int i = 0; i < N - 2; i++) {
            for (int j = i + 1; j < N - 1; j++) {
                int twoSum = cards[i] + cards[j];
                if (twoSum >= M) continue;

                int remain = M - twoSum;
                int k = binarySearch(cards, j + 1, N - 1, remain);

                if (k != -1) {
                    int total = twoSum + cards[k];
                    result = Math.max(result, total);
                }
            }
        }

        System.out.println(result);
    }

    // remain 이하의 최댓값 인덱스 찾기
    static int binarySearch(int[] arr, int left, int right, int target) {
        int idx = -1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] <= target) {
                idx = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return idx;
    }
}
