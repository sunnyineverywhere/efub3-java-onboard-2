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
        for(int i=0;i<3;i++){
            int sum=0;
            for(int j=0;j<4;j++){
                sum+=values[i][j];
            }
            if(sum==0)
                answer.add("D");
            else if(sum==1)
                answer.add("C");
            else if(sum==2)
                answer.add("B");
            else if(sum==3)
                answer.add("A");
            else
                answer.add("E");
        }
        return answer;
    }
}
