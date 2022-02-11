package programmers.level1;

/**
 * [12930] 이상한 문자 만들기
 * https://programmers.co.kr/learn/courses/30/lessons/12930
 */

public class sol12930 {
    public String solution(String s) {

        String[] answer = s.split("");

        int index = 0;

        for(int i = 0; i < answer.length; i++) {
            if(answer[i].equals(" ")) {
                answer[i] = " ";
                index = 0;
            }

            else {
                if(index % 2 == 0) {
                    answer[i] = answer[i].toUpperCase();
                }
                else {
                    answer[i] = answer[i].toLowerCase();
                }
                index++;
            }
        }
        return String.join("", answer);
    }
}
