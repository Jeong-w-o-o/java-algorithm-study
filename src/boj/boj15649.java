package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * [15649] N과 M (1)
 * https://www.acmicpc.net/problem/15649
 */

public class boj15649 {

    public static int N, M;
    public static int[] arr, checked;
    public static StringBuilder sb = new StringBuilder();

    private static void find(int k) {
        if (k == M + 1) {
            for (int i = 1; i <= M; i++) {
                sb.append(arr[i]).append(' ');
            }
            sb.append('\n');
        }
        else {
            for (int i = 1; i <= N; i++) {
                if(checked[i] == 1)
                    continue;
                arr[k] = i;
                checked[i] = 1;
                find(k+1);
                arr[k] = 0;
                checked[i] = 0;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[M+1];
        checked = new int[N+1];
        find(1);
        System.out.println(sb.toString());
    }
}
