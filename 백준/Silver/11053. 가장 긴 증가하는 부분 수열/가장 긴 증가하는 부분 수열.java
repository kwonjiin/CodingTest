import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) A[i] = sc.nextInt();

        ArrayList<Integer> lis = new ArrayList<>();
        lis.add(A[0]);

        for (int i = 1; i < N; i++) {
            if (A[i] > lis.get(lis.size() - 1)) {
                lis.add(A[i]);
            } else {
                // 이분 탐색으로 교체 위치 찾기
                int left = 0, right = lis.size() - 1;
                while (left < right) {
                    int mid = (left + right) / 2;
                    if (lis.get(mid) >= A[i]) right = mid;
                    else left = mid + 1;
                }
                lis.set(right, A[i]);
            }
        }

        System.out.println(lis.size());
    }
}
