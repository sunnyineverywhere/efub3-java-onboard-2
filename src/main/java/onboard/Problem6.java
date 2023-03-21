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
        for(int i=0;i<3;i++) {
        	int zero=0;
        	for(int j=0;j<4;j++) {
        		if(values[i][j]==0) zero++;
        	}
        	if(zero==1) answer.add("A");
        	else if(zero==2) answer.add("B");
        	else if(zero==3) answer.add("C");
        	else if(zero==4) answer.add("D");
        	else answer.add("E");
        }
        return answer;
    }
}
