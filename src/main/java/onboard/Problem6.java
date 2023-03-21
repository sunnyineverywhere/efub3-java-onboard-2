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
            Integer cnt0 = 0;
            for(int j=0; j<4; j++) if(values[i][j]==0) cnt0++;

            switch(cnt0){
                case 1: answer.add("A"); break;
                case 2: answer.add("B"); break;
                case 3: answer.add("C"); break;
                case 4: answer.add("D"); break;
                case 0: answer.add("E"); break;
            }
        }
        return answer;
    }
}