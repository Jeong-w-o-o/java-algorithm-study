package programmers.level1;

import java.util.Scanner;

/**
 * [12969] 직사각형 별 찍기
 * https://programmers.co.kr/learn/courses/30/lessons/12969
 */

public class sol12969 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
