package onboard;

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
        /*
        기준이 100 * 100이니깐  [100][100] 짜리 배열을 만들었다.
        입력받은 x,y을 인덱스로 잡아서 값을 = 1로 변경한다.
        그리고 x + 10 , y + 10 해서 돌 때까지 값을 추가한다. (색종이 길이가 10cm이니깐.)
        그리고 이 배열을 풀면서
        -인덱스 x,y 의 자리에 있는 값이 1 인 것들만 빼서 그 수를 계산한다.
        -그에 맞는 배열만 다 더하면 넓이가 된다.*/

        /* 혹은 overlap 빼기..? */
        for(int i=0; i<paperNumber; i++){
            answer += 10 *10;
            if(i==0){
                continue;
            }
            for(int j=0; j<i; j++){
                if(Math.abs(locations[j][0]-locations[i][0])<10 && Math.abs(locations[j][1] - locations[i][1])<10)
                {
                    int overlap = (10-Math.abs(locations[j][0]-locations[i][0])) * (10-Math.abs(locations[j][1]-locations[i][1]));
                    answer -= overlap;
                }
            }
        }

        return answer;
    }
}
