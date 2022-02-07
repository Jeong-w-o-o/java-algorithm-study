package programmers.level1;

/**
 * [12954] x만큼 간격이 있는 n개의 숫자
 * https://programmers.co.kr/learn/courses/30/lessons/12954
 */

public class sol12954 {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];

        answer[0] = x;

        for(int i = 1; i < n; i++) {
            answer[i] = answer[i-1] + x;
        }

        return answer;
    }
}
