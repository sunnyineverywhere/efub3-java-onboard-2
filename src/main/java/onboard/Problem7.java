package onboard;

import java.util.ArrayList;
import java.util.List;

/**
 * 백준 10798
 * name: 세로읽기
 * 브론즈 1
 * link : https://www.acmicpc.net/problem/10798
 */
public class Problem7 {
    public static String solution(List<String> values){
        String answer = "";
        for (int i=0; i<15; i++){
            for (int j=0; j<5; j++){
                answer.concat(values.get(j));
            }
        }
        return answer;
    }
}
