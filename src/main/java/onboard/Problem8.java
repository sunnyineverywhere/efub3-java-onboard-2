package onboard;

import java.util.List;

/**
 * 백준 2563
 * name: 색종이
 * 실버 5
 * link : https://www.acmicpc.net/problem/2563
 */
public class Problem8 { // 0~99, 0~99
    public static Integer solution(Integer paperNumber, Integer[][] locations){
        Integer answer = 0;
        int[][] colored = new int[100][100];
        for(int i=0; i<100; i++){
            for(int j=0; j<100; j++){
                colored[i][j] = 0;
            }
        }

        for(int i=0; i<paperNumber; i++){
            for(int j=locations[i][0]; j<(locations[i][0]+10); j++){
                for(int k=locations[i][1]; k<(locations[i][1]+10); k++){
                    colored[j][k] = 1;
                }
            }
        }

        for(int i=0; i<100; i++){
            for(int j=0; j<100; j++){
                answer += colored[i][j];
            }
        }

        return answer;
    }
}
