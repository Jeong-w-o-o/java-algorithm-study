package programmers.level1;

import java.util.Arrays;
import java.util.Collections;

/**
 * [12933] 정수 내림차순으로 배치하기
 * https://programmers.co.kr/learn/courses/30/lessons/12933
 */

public class sol12933 {
    public long solution(long n) {
        long answer = 0;

        String str = Long.toString(n);
        String[]  arr = str.split("");

        Arrays.sort(arr, Collections.reverseOrder());
        answer = Long.parseLong(String.join("", arr));

        return answer;
    }
}
