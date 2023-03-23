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
        String answer = "";
        int max=0;
        for(int i=0;i<5;i++){
            if(values.get(i).length()>max)
                max=values.get(i).length();
        }
        char[][] newvalues=new char[5][max];
        for(int i=0;i<5;i++){
            for(int j=0;j<values.get(i).length();j++){
                newvalues[i][j]=values.get(i).charAt(j);
            }
        }
        for(int i=0;i<max;i++){
            for(int j=0;j<5;j++){
                if(newvalues[j][i]=='\0')
                    continue;
                answer+=newvalues[j][i];
            }
        }
        return answer;
    }
}
