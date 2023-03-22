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

        int[][] paper = new int[100][100];

        for (int i=0; i<paperNumber; i++) {
            int x = locations[i][0];
            int y = locations[i][1];

            for (int j=x; j<x+10; j++) {
                for (int k=y; k<y+10; k++) {
                    paper[j][k] = 1;
                }
            }
        }

        for (int i=0; i<100; i++) {
            for (int j=0; j<100; j++) {
                if (paper[i][j] == 1)
                    answer++;
            }
        }

        return answer;
    }
}
