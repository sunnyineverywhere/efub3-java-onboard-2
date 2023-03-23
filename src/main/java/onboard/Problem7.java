package onboard;

import java.util.ArrayList;
import java.util.List;

public class Problem7 {
    public static String solution(List<String> values){
        String answer = "";
        for(int i=1; i<=15; i++){
            for(int j=0; j<values.size(); j++){
                if(values.get(j).length() >= i){
                    answer += values.get(j).charAt(i-1);
                }
            }
        }
        return answer;
    }
}
