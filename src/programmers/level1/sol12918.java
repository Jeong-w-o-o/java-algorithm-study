package programmers.level1;

/**
 * [12918] 문자열 다루기 기본
 * https://programmers.co.kr/learn/courses/30/lessons/12918
 */

public class sol12918 {
    public boolean solution(String s) {
        String regex = "[0-9]+";

        if (s.length() == 4 || s.length() == 6) {
            if (s.matches(regex)) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}
