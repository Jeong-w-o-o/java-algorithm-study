package programmers.level1;

/**
 * [12943] 콜라츠 추측
 * https://programmers.co.kr/learn/courses/30/lessons/12943
 */

public class sol12943 {
    public int solution(long num) {
        int answer = 0;

        while(num != 1) {
            if( num%2 == 0) {
                answer++;
                num /= 2;
            }
            else {
                answer++;
                num = num * 3 +1;
            }
            if(answer >= 500) {
                answer = -1;
                break;
            }

        }

        return answer;
    }
}
