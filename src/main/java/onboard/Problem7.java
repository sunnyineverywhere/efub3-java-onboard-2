package onboard;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/**
 * 백준 10798
 * name: 세로읽기
 * 브론즈 1
 * link : https://www.acmicpc.net/problem/10798
 */
public class Problem7 {
    public static String solution(List<String> values){
        int max = values.get(0).length();
        for(int i = 1; i < values.size(); i++)
            if(max < values.get(i).length())
                max = values.get(i).length();

        String answer = "";

        for(int j = 0; j < max; j++) {
            for (int i = 0; i < values.size(); i++) {
                if(values.get(i).length() <= j)
                    continue;

                answer = answer.concat(values.get(i).substring(j, j + 1));
            }
        }
        return answer;
    }
}
