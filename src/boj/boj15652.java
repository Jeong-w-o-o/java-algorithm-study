package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * [15652] N과 M (4)
 * https://www.acmicpc.net/problem/15652
 */

public class boj15652 {

    public static int N, M;
    public static int[] arr;
    public static StringBuilder sb = new StringBuilder();

    private static void find(int k) {
        if (k == M + 1) {
            for (int i = 1; i <= M; i++) {
                sb.append(arr[i]).append(' ');
            }
            sb.append('\n');
        }
        else {
            int start = arr[k-1];
            if (start == 0) {
                start = 1;
            }
            for (int i = start; i <= N; i++) {
                arr[k] = i;
                find(k+1);
                arr[k] = 0;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[M+1];
        find(1);
        System.out.println(sb.toString());
    }
}
