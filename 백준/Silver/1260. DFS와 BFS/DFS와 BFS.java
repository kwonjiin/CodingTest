import java.io.*;
import java.util.*;

public class Main{
    static ArrayList<Integer>[] graph;
    // 방문 여부 체크 배열
    static boolean[] check;
    // 출력 결과를 저장할 StringBuilder
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 입력: 정점 개수, 간선 개수, 시작 정점
        int node = Integer.parseInt(st.nextToken());
        int line = Integer.parseInt(st.nextToken());
        int start = Integer.parseInt(st.nextToken());

        // 그래프 배열 생성 (정점 번호는 1번부터 시작하므로 node+1 크기)
        graph = new ArrayList[node + 1];

        // 모든 정점을 인접 리스트로 초기화
        for (int i = 1; i <= node; i++) {
            graph[i] = new ArrayList<>();
        }

        // 간선 정보 입력
        for (int i = 0; i < line; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            // 양방향 그래프이므로 양쪽에 모두 추가
            graph[a].add(b);
            graph[b].add(a);
        }

        // 방문 순서를 보장하기 위해 인접 리스트를 오름차순 정렬
        for (int i = 1; i <= node; i++) {
            Collections.sort(graph[i]);
        }

        check = new boolean[node + 1]; // 방문 배열 초기화
        dfs(start);
        sb.append("\n");

        check = new boolean[node + 1]; // 방문 배열 초기화
        bfs(start);

        // 최종 출력
        System.out.println(sb);
    }

    public static void dfs(int start) {
        check[start] = true; // 현재 노드 방문 처리
        sb.append(start).append(" "); // 방문 순서 기록

        // 인접한 노드들을 작은 번호부터 방문
        for (int next : graph[start]) {
            if (!check[next]) {
                dfs(next);
            }
        }
    }

    public static void bfs(int start) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(start);
        check[start] = true; // 시작 노드 방문 처리

        while (!q.isEmpty()) {
            int node = q.poll(); // 큐에서 꺼냄
            sb.append(node).append(" "); // 방문 순서 기록

            // 인접한 노드들을 작은 번호부터 방문
            for (int next : graph[node]) {
                if (!check[next]) {
                    check[next] = true;
                    q.offer(next);
                }
            }
        }
    }
}