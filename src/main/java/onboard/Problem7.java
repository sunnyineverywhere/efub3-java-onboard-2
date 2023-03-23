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
        int max_length = values.get(0).length(); // 첫 번째 줄은 공백이 없으므로

        for(int i = 0; i < values.size()-1; i++)
            if(max_length < values.get(i).length())
                max_length = values.get(i).length(); // 첫 번째 줄보다 길이가 긴 열이 있을 경우


        for(int j = 0; j < max_length; j++) {
            for (int k = 0; k < values.size(); k++) {
                if(values.get(k).length() <= j)
                    continue;
                // concat : 문자열 합치기
                answer = answer.concat(values.get(k).substring(j, j+1));
            }
        }
        return answer;
    }
}
