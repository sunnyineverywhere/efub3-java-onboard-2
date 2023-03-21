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
        String[] sol= {values.get(0),values.get(1),values.get(2),values.get(3),values.get(4)};
	        int max=sol[0].length();
	        //최대 길이 구하기
	        for(int i=0;i<5;i++) {
	        	if(max<sol[i].length()) max=sol[i].length();
	        }
	        
	        for(int i=0;i<max;i++) {
	        	for(int j=0;j<5;j++) {
	        		//배열의 길이가 충분한 경우
	        		if(sol[j].length()>i) {
	        		char c=sol[j].charAt(i);
	        		answer+=c;
	        		}
	        	}
	        }
        return answer;
    }
}
