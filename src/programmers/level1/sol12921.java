package programmers.level1;

/**
 * [12921] 소수 찾기
 * https://programmers.co.kr/learn/courses/30/lessons/12921
 */

public class sol12921 {
    public int solution(int n) {
        int answer = 0;
        int[] check = new int[n+1];

        for(int i = 2; i <= n; i++) {
            if(check[i] == 0) {
                answer++;
                for(int j = i; j <= n; j = j + i) {
                    check[j] = 1;
                }
            }
        }
        return answer;
    }
}
