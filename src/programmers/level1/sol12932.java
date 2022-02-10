package programmers.level1;

/**
 * [12932] 자연수 뒤집어 배열로 만들기
 * https://programmers.co.kr/learn/courses/30/lessons/12932
 */

public class sol12932 {
    public int[] solution(long n) {

        String strNum = Long.toString(n);
        int answer[] = new int[strNum.length()];
        int cnt = 0;

        while(n > 0) {
            answer[cnt] = (int)(n%10);
            n /= 10;
            cnt++;
        }

//         for(int i = 0; i < answer.length; i++) {
//             answer[i] = strNum.charAt(answer.length - 1 - i) - '0';
//         }

        return answer;
    }
}
