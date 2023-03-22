package onboard;

import java.util.List;
import java.util.StringTokenizer;

/**
 * 백준 2563
 * name: 색종이
 * 실버 5
 * link : https://www.acmicpc.net/problem/2563
 */
public class Problem8 {
    public static Integer solution(Integer paperNumber, Integer[][] locations){
        Integer answer = 0;

        boolean[][] arr = new boolean[101][101];  //도화지
        for (int i = 0; i < paperNumber; i++) {
            int x = locations[i][0];
            int y = locations[i][1];
            for (int j = x; j < x+10; j++) {
                for (int k = y; k < y+10; k++) {
                    if (!arr[j][k]) {
                        arr[j][k] = true;
                        answer++;
                    }
                }
            }
        }


        return answer;
    }
}
