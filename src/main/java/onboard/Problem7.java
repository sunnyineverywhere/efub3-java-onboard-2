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
        StringBuilder sb = new StringBuilder();
        Character[][] input = new Character[5][15];

        for(int i=0; i<5; i++){
            String str = values.get(i);
            Integer len = str.length();
            for(int j=0; j<len; j++) input[i][j] = str.charAt(j);
            for(int j=len; j<15; j++) input[i][j] = '?';
        }

        for(int j=0; j<15; j++){
            for(int i=0; i<5; i++){
                if(input[i][j]=='?') continue;
                sb.append(input[i][j]);
            }
        }
        return sb.toString();
    }
}
