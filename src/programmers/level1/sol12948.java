package programmers.level1;

/**
 * [12948] 핸드폰 번호 가리기
 * https://programmers.co.kr/learn/courses/30/lessons/12948
 */

public class sol12948 {
    public String solution(String phone_number) {
        String answer = "";
        String sub = phone_number.substring(phone_number.length()-4, phone_number.length());

        for(int i = 0; i < phone_number.length()-4; i++) {
            answer += "*";
        }
        answer += sub;

        return answer;
    }
}
