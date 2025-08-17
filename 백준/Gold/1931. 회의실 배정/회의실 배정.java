import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        List<int[]> meetings = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            meetings.add(new int[]{start, end});
        }
        
        Collections.sort(meetings, (a, b) -> {
            if (a[1] == b[1]) return a[0] - b[0];
            return a[1] - b[1];
        });
        
        int count = 0;
        int end = 0;
        
        for(int[] meeting : meetings) {
            if(meeting[0] >= end){
                count++;
                end = meeting[1];
            }
        }
        System.out.println(count);
    }
}