package programmers.level1;

/**
 * [14888] 연산자 끼워넣기
 * https://www.acmicpc.net/problem/14888
 */

public class sol12901 {
    public String solution(int a, int b) {
        String answer = "";
        int sum = 0;
        String[] days = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
        int[] date = {31,29,31,30,31,30,31,31,30,31,30,31};

        for(int i = 0; i < a-1; i++) {
            sum += date[i];
        }
        sum += b;
        switch(sum % 7) {
            case 0 : answer = days[4];
                break;
            case 1 : answer = days[5];
                break;
            case 2 : answer = days[6];
                break;
            case 3 : answer = days[0];
                break;
            case 4 : answer = days[1];
                break;
            case 5 : answer = days[2];
                break;
            case 6 : answer = days[3];
                break;
        }
        return answer;
    }
}
