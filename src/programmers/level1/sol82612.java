package programmers.level1;

/**
 * [82612] 부족한 금액 계산하기
 * https://programmers.co.kr/learn/courses/30/lessons/82612
 */

public class sol82612 {
    public long solution(int price, int money, int count) {
        long answer = 0;
        long sum = 0;

        for(int i = 1; i <= count; i++) {
            sum += price * i;
            System.out.println(sum);
        }

        if(sum > money) {
            answer = sum-money;
        }

        return answer;
    }
}
