package onboard;


import java.util.ArrayList;
import java.util.Arrays;
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
        for(Integer[] val : values)
        {
            int sum = Arrays.stream(val).reduce(0,(a,b)->  a + b);
            if(sum == 4)
            {
                answer.add("E");
            }
            else{
                answer.add(String.valueOf((char)(68 - sum)));
            }
        }
        return answer;
    }
}
