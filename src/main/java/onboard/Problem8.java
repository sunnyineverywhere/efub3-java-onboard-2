package onboard;

import java.util.List;

public class Problem8 {
    public static Integer solution(Integer paperNumber, Integer[][] locations){
        Integer answer = 0;
        answer += paperNumber * 100;
        for(int i=0; i<paperNumber; i++){
            for(int j=i+1; j<paperNumber; j++){
                if(Math.abs(locations[i][0]-locations[j][0]) < 10 && Math.abs(locations[i][1]-locations[j][1]) < 10){
                    answer -= (10-Math.abs(locations[i][0]-locations[j][0])) * (10-Math.abs(locations[i][1]-locations[j][1]));
                }
            }
        }
        return answer;
    }
}
