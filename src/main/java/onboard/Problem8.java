package onboard;

/**
 * 백준 2563
 * name: 색종이
 * 실버 5
 * link : https://www.acmicpc.net/problem/2563
 */
public class Problem8 {
    public static Integer solution(Integer paperNumber, Integer[][] locations){
        Integer answer = 0;
        boolean[][] paper = new boolean[100][100];

        for(int i = 0; i < paperNumber; i++) {
            int X = locations[i][0];
            int Y = locations[i][1];
            for(int x = X; x < X + 10; x++) {
                for(int y = Y; y < Y + 10; y++) {
                    if(!paper[x][y]) {
                        paper[x][y] = true;
                        answer++;
                    }
                }
            }
        }
        return answer;
    }
}