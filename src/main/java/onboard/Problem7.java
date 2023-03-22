package onboard;

import java.util.ArrayList;
import java.util.Arrays;
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

        char[][] arr = new char[5][15];

        for (int i=0; i<5; i++) {
            String str = values.get(i);

            for (int j=0; j<str.length(); j++) {
                arr[i][j] = str.charAt(j);
            }
        }

        for (int i=0; i<15; i++) {
            for (int j=0; j<5; j++) {
                if (arr[j][i] == 0)
                    continue;
                answer = answer + arr[j][i];
            }
        }

        return answer;
    }
}
