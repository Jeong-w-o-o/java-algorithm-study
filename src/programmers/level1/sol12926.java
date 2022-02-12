package programmers.level1;

/**
 * [12926] 시저 암호
 * https://programmers.co.kr/learn/courses/30/lessons/12926
 */

public class sol12926 {
    public String solution(String s, int n) {
        String answer = "";
        char[] ch = s.toCharArray();

        for(int i = 0; i < ch.length; i++) {
            if(ch[i] >= 'a' && ch[i] <= 'z') {
                if(ch[i] + n > 'z') {
                    ch[i] += n - 26;
                }
                else {
                    ch[i] += n;
                }
            }
            else if (ch[i] >= 'A' && ch[i] <= 'Z') {
                if(ch[i] + n > 'Z') {
                    ch[i] += n - 26;
                }
                else {
                    ch[i] += n;
                }
            }
            answer = String.valueOf(ch);
        }
        return answer;
//        for(int i=0; i<s.length(); i++) {
//            char ch = s.charAt(i);
//            if(Character.isLowerCase(ch)) {
//                ch = (char) ((ch - 'a' + n) % 26 + 'a');
//            }
//            else if(Character.isUpperCase(ch)) {
//                 ch = (char) ((ch - 'A' + n) % 26 + 'A');
//            }
//            answer += ch;
//        }
//        return answer;
    }
}
