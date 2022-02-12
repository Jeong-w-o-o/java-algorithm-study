package programmers.level1;

/**
 * [12926] 시저 암호
 * https://programmers.co.kr/learn/courses/30/lessons/12926
 */

public class sol12926 {
    public String solution(String s, int n) {
        String answer = "";

        for(int i=0; i<s.length(); i++) {
            char ch = s.charAt(i);
            if(Character.isLowerCase(ch)) {
                ch = (char) ((ch - 'a' + n) % 26 + 'a');
            }
            else if(Character.isUpperCase(ch)) {
                 ch = (char) ((ch - 'A' + n) % 26 + 'A');
            }
            answer += ch;
        }
        return answer;
    }
}
