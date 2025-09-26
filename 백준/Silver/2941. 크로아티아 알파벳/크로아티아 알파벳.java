import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        String[] croatia = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

        for(String c : croatia){
            s = s.replace(c, "*"); // 크로아티아 알파벳을 *로 치환
        }

        System.out.println(s.length()); // 길이가 곧 글자 수
    }
}
