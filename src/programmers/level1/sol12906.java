package programmers.level1;

import java.util.ArrayList;
import java.util.List;

/**
 * [12906] 같은 숫자는 싫어
 * https://programmers.co.kr/learn/courses/30/lessons/12906
 */

public class sol12906 {
    public int[] solution(int []arr) {
        List<Integer> list = new ArrayList<Integer>();

        for(int i = 0; i < arr.length - 1; i++) {
            if(arr[i] != arr[i+1]) {
                list.add(arr[i]);
            }
            if(i == arr.length - 2) {
                list.add(arr[i+1]);
            }
        }

        int[] answer = new int [list.size()];

        for(int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}
