package programmers.level1;

/**
 * [12940] 최대공약수와 최소공배수
 * https://programmers.co.kr/learn/courses/30/lessons/12940
 */

public class sol12940 {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];

        answer[0] = gcd(n, m);
        answer[1] = lcm(n, m);
        return answer;
    }

    private static int gcd(int a, int b) {
        if (a%b == 0) {
            return b;
        }
        return gcd(b, a%b);
    }

    private static int lcm(int a, int b) {
        return a*b / gcd(a, b);
    }
}
