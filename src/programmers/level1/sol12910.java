package programmers.level1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * [12910] 나누어 떨어지는 숫자 배열
 * https://programmers.co.kr/learn/courses/30/lessons/12910
 */

public class sol12910 {
    public int[] solution(int[] arr, int divisor) {
        List<Integer> arrList = new ArrayList<Integer>();

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] % divisor == 0) {
                arrList.add(arr[i]);
            }
        }

        int[] answer = new int[arrList.size()];

        Collections.sort(arrList);

        if(arrList.size() == 0) {
            answer = new int[1];
            answer[0] = -1;
        }

        for(int i = 0; i < arrList.size(); i++) {
            answer[i] = arrList.get(i);
        }
        return answer;
    }
}
