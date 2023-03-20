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
        String[] results = {"E", "A", "B", "C", "D"};
        for (Integer[] value : values) {
            int cnt = 0;    // 배의 개수
            for (Integer x : value) {
                if (x == 0) {
                    cnt++;
                }
            }
            answer.add(results[cnt]);
        }
        return answer;
    }
}
