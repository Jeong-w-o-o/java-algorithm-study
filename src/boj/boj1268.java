package boj;

import java.util.Scanner;

public class boj1268 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][5];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 5; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {
            int cnt = 0;
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < 5; k++) {
                    if (i == j) {
                        break;
                    }
                    if (arr[i][k] == arr[j][k]) {
                        cnt++;
                        ans[i] = cnt;
                        break;
                    }
                }
            }
        }

        int max = Integer.MIN_VALUE;
        int num = 0;

        for(int i = 0; i < n; i++) {
            if (ans[i] > max) {
                max = ans[i];
                num = i+1;
            }
            if (ans[i] == max) {
                num = Math.min(num, i+1);
            }
        }
        System.out.println(num);
    }
}
