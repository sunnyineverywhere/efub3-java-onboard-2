package onboard;

import java.util.List;

/**
 * 백준 2563
 * name: 색종이
 * 실버 5
 * link : https://www.acmicpc.net/problem/2563
 */
public class Problem8 {
    public static Integer solution(Integer paperNumber, Integer[][] locations){
        Integer answer = 0;

        boolean[][] plain = new boolean[100][100];

        for(int i=0; i<paperNumber; i++){
            Integer a = locations[i][0];
            Integer b = locations[i][1];
            for(int j=100-b-10; j<100-b; j++){
                for(int k=a; k<a+10; k++){
                    if(plain[j][k]) continue;
                    plain[j][k] = true; answer++;
                }
            }
        }

        return answer;
    }
}
