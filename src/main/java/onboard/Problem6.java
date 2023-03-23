package onboard;

import java.util.ArrayList;
import java.util.List;

public class Problem6 {
    public static List<String> solution(Integer[][] values){
        List<String> answer = new ArrayList<>();
        for(int i=0; i<3; i++){
            int cnt = 0;
            for(int j=0; j<4; j++){
                if(values[i][j] == 1){
                    cnt++;
                }
            }

            switch(cnt){
                case 3:
                    answer.add("A");
                    break;
                case 2:
                    answer.add("B");
                    break;
                case 1:
                    answer.add("C");
                    break;
                case 0:
                    answer.add("D");
                    break;
                case 4:
                    answer.add("E");
                    break;
            }
        }
        return answer;
    }
}
