import java.util.*;
 
public class Main {
    static final int MAX = 100000;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 수빈 위치
        int K = sc.nextInt(); // 동생 위치
        
        boolean[] visited = new boolean[MAX + 1]; // 방문 여부
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{N, 0}); // 위치, 시간
        visited[N] = true;
        
        while (!q.isEmpty()) {
            int[] now = q.poll();
            int pos = now[0];
            int time = now[1];
            
            // 동생 찾으면 종료
            if (pos == K) {
                System.out.println(time);
                return;
            }
            
            // 세 가지 이동
            if (pos - 1 >= 0 && !visited[pos - 1]) {
                visited[pos - 1] = true;
                q.add(new int[]{pos - 1, time + 1});
            }
            if (pos + 1 <= MAX && !visited[pos + 1]) {
                visited[pos + 1] = true;
                q.add(new int[]{pos + 1, time + 1});
            }
            if (pos * 2 <= MAX && !visited[pos * 2]) {
                visited[pos * 2] = true;
                q.add(new int[]{pos * 2, time + 1});
            }
        }
    }
}
