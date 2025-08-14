import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    static class Node {
        int num;
        int cnt;
        Node(int num, int cnt) {
            this.num = num;
            this.cnt = cnt;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int X = Integer.parseInt(br.readLine());

        Queue<Node> q = new LinkedList<>();
        q.add(new Node(X, 0));

        boolean[] visited = new boolean[X + 1];
        visited[X] = true;

        while (!q.isEmpty()) {
            Node cur = q.poll();

            if (cur.num == 1) {
                System.out.println(cur.cnt);
                return;
            }

            // 3으로 나누기
            if (cur.num % 3 == 0 && !visited[cur.num / 3]) {
                visited[cur.num / 3] = true;
                q.add(new Node(cur.num / 3, cur.cnt + 1));
            }

            // 2로 나누기
            if (cur.num % 2 == 0 && !visited[cur.num / 2]) {
                visited[cur.num / 2] = true;
                q.add(new Node(cur.num / 2, cur.cnt + 1));
            }

            // 1 빼기
            if (!visited[cur.num - 1]) {
                visited[cur.num - 1] = true;
                q.add(new Node(cur.num - 1, cur.cnt + 1));
            }
        }
    }
}
