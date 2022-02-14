package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * [15650] N과 M (2)
 * https://www.acmicpc.net/problem/15650
 */

public class boj15650 {

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

            for (int i = arr[k-1] + 1; i <= N; i++) {
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
        checked = new int[N+1];
        find(1);
        System.out.println(sb.toString());
    }
}
