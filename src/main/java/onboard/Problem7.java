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
    public static void main(String[] args) {

    }
    List<String> values = List.of("rnjswldbs", "dlsf", "sdlkf", "sdlfk3", "Tdslkf1");
    public static String solution(List<String> values){
        String answer = "";
        int last = values.get(0).length();
        for(int i = 1; i < values.size(); i++)
            if(last < values.get(i).length())
                last = values.get(i).length();


        for(int j = 0; j < last; j++) {
            for (int k = 0; k < values.size(); k++) {
                if(values.get(k).length() <= j)
                    continue;
                answer = answer.concat(values.get(k).substring(j, j + 1));
            }
        }
        return answer;
    }
}

