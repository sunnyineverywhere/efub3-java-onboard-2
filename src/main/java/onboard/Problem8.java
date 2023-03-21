package onboard;

import java.util.Arrays;
import java.util.List;

/**
 * 백준 2563
 * name: 색종이
 * 실버 5
 * link : https://www.acmicpc.net/problem/2563
 */
public class Problem8 {
    public static Integer solution(Integer paperNumber, Integer[][] locations){
        Integer answer = 0;
        boolean[][] arr = new boolean[100][100];
        for(boolean a[]:arr)
            Arrays.fill(a,true);

        for(int i=0;i<paperNumber;i++)
            for(int j=locations[i][0];j<locations[i][0]+10;j++)
                for(int k=locations[i][1];k<locations[i][1]+10;k++)
                    arr[j][k]=false;

        for(int i=0;i<100;i++)
            for(int j=0;j<100;j++)
                if(arr[i][j]==false)
                    answer++;
        return answer;
    }
}
