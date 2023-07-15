import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {

    public static int[] arr;
    public static boolean[] visit;
    static int n,m;

    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        arr = new int[m];
        visit = new boolean[n+1];
        dfs(0);

    }
    static void dfs(int depth){

        if(depth == m){//재귀 탈출
            StringBuilder sb = new StringBuilder();
            for (int i : arr) {
                sb.append(i).append(' ');
            }
            System.out.println(sb);
            return;
        }

        for(int i=1; i<=n; i++){
            if(!visit[i]){
                visit[i]=true;
                arr[depth]=i;
                dfs(depth+1);
                visit[i]=false;
            }
        }
    }

}