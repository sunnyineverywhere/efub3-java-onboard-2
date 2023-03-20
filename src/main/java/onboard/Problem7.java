package onboard;

import java.util.List;

/**
 * 백준 10798
 * name: 세로읽기
 * 브론즈 1
 * link : https://www.acmicpc.net/problem/10798
 */
public class Problem7 {
    public static String solution(List<String> values){
        String answer;
        StringBuilder ans = new StringBuilder();
        char[][] arr = new char[5][15];

        for(int i=0; i<5; i++){
            for(int j=0; j<values.get(i).length(); j++){
                arr[i][j] = values.get(i).charAt(j);
            }
        }

        for(int i=0; i<15; i++){
            for(int j=0; j<5; j++){
                if(arr[j][i] == '\0') continue;
                ans.append(arr[j][i]);
            }
        }
        answer = ans.toString();
        return answer;
    }
}
