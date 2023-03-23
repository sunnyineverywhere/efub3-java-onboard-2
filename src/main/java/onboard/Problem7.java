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
        int max = values.get(0).length();
        for(int i = 1; i < values.size(); i++) {
            if(max < values.get(i).length())
                max = values.get(i).length();
        }

        for(int i = 0; i < max; i++) {
            for(int j = 0; j < values.size(); j++) {
                if(values.get(j).length() <= i)
                    continue;
                answer+=values.get(j).charAt(i);
            }
        }
        return answer;
    }
}
