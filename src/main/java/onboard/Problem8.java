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
        for(int i=0; i<paperNumber; i++){
            answer += 10 *10;
            if(i==0){
                continue;
            }
            for(int j=0; j<i; j++){
                if(Math.abs(locations[j][0]-locations[i][0])<10 && Math.abs(locations[j][1] - locations[i][1])<10){
                    int overlap = (10-Math.abs(locations[j][0]-locations[i][0])) * (10-Math.abs(locations[j][1]-locations[i][1]));
                    answer -= overlap;
                }
            }
        }
        return answer;
    }
}
