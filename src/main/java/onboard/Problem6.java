package onboard;

import java.util.ArrayList;
import java.util.List;

/**
 * 백준 2490
 * name: 윷놀이
 * 브론즈 3
 * link : https://www.acmicpc.net/problem/2490
 */
public class Problem6 {
    public static List<String> solution(Integer[][] values){
        List<String> answer = new ArrayList<>();
       // 도 : 0111 , 개:0011, 걸:0001, 윷:0000, 모:1111
        int cnt0 = 0, cnt1=0;
        char result;
        for(int i=0; i<4; i++){
            for (int j=0; j<4; j++){
                if(values[i][j] == 0)
                    cnt0++;
                else if(values[i][j] == 1)
                    cnt1++;
            }
            if(cnt0==1 && cnt1==3)
                answer.add("도");
            else if(cnt0 == 2 && cnt1==2)
                answer.add("개");
            else if(cnt0==3 && cnt1 ==1)
                answer.add("걸");
            else if(cnt0==4 && cnt1==0)
                answer.add("윷");
            else if(cnt0==0 && cnt1==4)
                answer.add("모");
        }
        return answer;
    }
}
