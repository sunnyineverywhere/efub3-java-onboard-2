package onboard;

import java.util.*;

/**
 * 백준 2563
 * name: 색종이
 * 실버 5
 * link : https://www.acmicpc.net/problem/2563
 */
public class Problem8 {
    public static Integer solution(Integer paperNumber, Integer[][] locations){
        Integer answer = 0;

        boolean[][] base = new boolean[100][100];

        Integer count = 0;
        while(count < paperNumber){
            int x = locations[count][0];
            int y = locations[count][1];
            for(int i = x; i < x + 10; i++)
                for(int j = y; j < y + 10; j++)
                    if(!base[i][j]) {
                        base[i][j] = true;
                        answer++;
                    }
            count++;
        }

        return answer;
    }
}
