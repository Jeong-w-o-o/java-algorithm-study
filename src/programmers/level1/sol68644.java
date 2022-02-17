package programmers.level1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * [68644] 두 개 뽑아서 더하기
 * https://programmers.co.kr/learn/courses/30/lessons/68644
 */

public class sol68644 {
    class Solution {
        public int[] solution(int[] numbers) {
            int sum = 0;
            List<Integer> list = new ArrayList<Integer>();

            for(int i = 0; i < numbers.length-1; i++) {
                for(int j = i+1; j < numbers.length; j++) {
                    sum = numbers[i] + numbers[j];
                    if(!list.contains(sum)) {
                        list.add(sum);
                    }
                }
            }

            Collections.sort(list);

            int[] answer = new int[list.size()];

            for(int i = 0; i < list.size(); i++) {
                answer[i] = list.get(i);
            }
            return answer;
        }
}
}
