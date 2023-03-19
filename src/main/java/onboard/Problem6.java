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

        Integer sum = 0;

        for(int i=0; i<3; i++){
            for(int j=0; j<4; j++){
                sum += values[i][j];
            }
            if (sum==3) {
                answer.add(i,"A");
            }
            else if (sum==2) {
                answer.add(i,"B");
            }
            else if (sum==1) {
                answer.add(i,"C");
            }
            else if (sum==0) {
                answer.add(i,"D");
            }
            else if (sum==4) {
                answer.add(i,"E");
            }
            sum = 0;
        }
        return answer;
    }
}
