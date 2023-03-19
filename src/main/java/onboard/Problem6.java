package onboard;

import java.util.ArrayList;
import java.util.List;

/**
 * 백준 2490
 * name: 윷놀이
 * 브론즈 3
 * link : https://www.acmicpc.net/problem/2490
 */
public class Problem6 {
    public static List<String> solution(Integer[][] values){
        List<String> answer = new ArrayList<>();
        for(Integer[] line : values) {
            int count = 0;
            for(Integer value : line) {
                if(value == 1) {
                    count++;
                }
            }
            String result = "";
            switch(count) {
                case 0:
                    result = "D";
                    break;
                case 1:
                    result = "C";
                    break;
                case 2:
                    result = "B";
                    break;
                case 3:
                    result = "A";
                    break;
                case 4:
                    result = "E";
                    break;
            }
            answer.add(result);
        }
        return answer;
    }
}
