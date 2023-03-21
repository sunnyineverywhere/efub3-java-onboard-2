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
    public static String solution(List<String> values){
        String answer = "";

        //주어진 values -> 문자 넣을 2차원 배열을 선언
        String [][] mat = new String[5][15];
        int [] len = new int[5];

        // 공백문자가 나오기 전까지 len ++
        for (int i=0; i<5; i++) {
            for (int j = 0; values.get(j) != "\0"; j++) {
                len[j]++;
            }
        }

        // len 까지 for 문을 돌려서 mat에 숫자를 넣고
        for(int i=0; i<5; i++){
            for (int j=0; j<len[i]; j++){
                mat[i][j] = values.get(j);
            }
        }

        // 세로로 읽기
        for (int i=0; i<15; i++){
            for (int j=0; j<5; j++){
                answer.concat(mat[j][i]);
            }
        }
        return answer;
    }
}
