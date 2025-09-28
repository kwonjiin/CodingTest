import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int M = Integer.parseInt(br.readLine());

        boolean[] arr = new boolean[21];

        for(int i=0; i<M; i++){
            String[] cmd = br.readLine().split(" ");
            String op = cmd[0];

            if(op.equals("add")){
                arr[Integer.parseInt(cmd[1])] = true;
            } else if(op.equals("remove")){
                arr[Integer.parseInt(cmd[1])] = false;
            } else if(op.equals("check")){
                sb.append(arr[Integer.parseInt(cmd[1])] ? 1 : 0).append("\n");
            } else if(op.equals("toggle")){
                int x = Integer.parseInt(cmd[1]);
                arr[x] = !arr[x];
            } else if(op.equals("all")){
                for(int j=1; j<=20; j++) arr[j] = true;
            } else if(op.equals("empty")){
                arr = new boolean[21];
            }
        }
        System.out.print(sb);
    }
}
