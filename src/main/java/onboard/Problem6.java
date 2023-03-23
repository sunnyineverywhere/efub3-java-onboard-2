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

        for(int i=0; i<3; i++){
            Integer counts = 0;
            for(int j=0; j<4; j++)
                if(values[i][j]==1) {
                    counts++;
                }
            if (counts == 0)
                answer.add("D");
            else if (counts == 1)
                answer.add("C");
            else if (counts == 2)
                answer.add("B");
            else if (counts == 3)
                answer.add("A");
            else
                answer.add("E");
        }
        return answer;
    }
}
