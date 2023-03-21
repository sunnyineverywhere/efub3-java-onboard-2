package onboard;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 백준 10798
 * name: 세로읽기
 * 브론즈 1
 * link : https://www.acmicpc.net/problem/10798
 */
public class Problem7 {
    public static String solution(List<String> values) {
        StringBuilder answer = new StringBuilder();

        //string을 배열에 넣기
        // 문자는 문자로 넣고 아닌건 *문자로
        Character[][] first = new Character[5][15];

        for (int i = 0; i < 5; i++) {
            String str = values.get(i);
            Integer len = str.length();
            for (int j = 0; j < len; j++) first[i][j] = str.charAt(j);
            for(int j=len; j<15; j++) first[i][j] = '*';
        }

        //세로로 읽기
        //문자는 그대로, 아닌건 패스
        for(int j=0; j<15; j++){
            for (int i=0; i<5; i++) {
                if (first[i][j] == '*') continue;
                answer.append(first[i][j]);
            }
        }
        return answer.toString();
    }
}
