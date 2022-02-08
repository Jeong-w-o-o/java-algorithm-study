package programmers.level1;

/**
 * [12947] 하샤드 수
 * https://programmers.co.kr/learn/courses/30/lessons/12947
 */
public class sol12947 {
    public boolean solution(int x) {

        boolean answer = true;
        int num = x;
        int sum = 0;

        while (x != 0) {
            sum += x%10;
            x /= 10;
        }

        if ( num % sum == 0 ) {
            answer = true;
        }
        else {
            answer = false;
        }

        return answer;
    }
}
