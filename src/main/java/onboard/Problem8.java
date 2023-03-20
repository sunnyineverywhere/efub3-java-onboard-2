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
        boolean[][] board = new boolean[100][100]; // 100X100 크기의 보드 생성

        Integer answer = 0; // 종이의 면적을 더할 변수 초기화
        for (int i=0; i< paperNumber; i++) {
            int x = locations[i][0]; // 종이의 x 좌표
            int y = locations[i][1]; // 종이의 y 좌표
            for (int j=x; j<x+10; j++) { //10x10 크기의 영역에 대해
                for (int k =y; k<y+10; k++) {
                    if(!board[j][k]) { // 종이가 없다면
                        board[j][k] = true; // 종이 붙이고
                        answer++; // 그 면적 더하기
                    }
                }
            }
        }
        return answer;
    }
}
