package onboard;

import java.util.Scanner;

/**
 * 백준 2563
 * name: 색종이
 * 실버 5
 * link : https://www.acmicpc.net/problem/2563
 */
public class Problem8 {
    public static Integer solution(Integer paperNumber, Integer[][] locations) {
        Integer answer = 0;
        boolean[][] area = new boolean[101][101];

        for (Integer[] location : locations) {
            for (int i = location[0]; i < location[0] + 10; i++) {
                for (int j = location[1]; j < location[1] + 10; j++) {
                    if (!area[i][j]) answer++;
                    area[i][j] = true;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int paperNumber = sc.nextInt();
        Integer[][] locations = new Integer[paperNumber][2];
        for (int i = 0; i < paperNumber; i++) {
            locations[i][0] = sc.nextInt();
            locations[i][1] = sc.nextInt();
        }
        System.out.println(Problem8.solution(paperNumber, locations));
    }
}
