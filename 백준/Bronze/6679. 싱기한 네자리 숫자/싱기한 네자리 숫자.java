import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        for(int i=1000;i<10000;i++){
            int ten = isTrue(i, 10);
            int two = isTrue(i, 12);
            int six = isTrue(i, 16);
            if(ten==two&&ten==six)sb.append(i).append('\n');
        }
        System.out.println(sb);
    }

    static int isTrue(int a, int b) {
        if (a < b) return a;

        return isTrue(a/b,b)+a%b;
    }

}
