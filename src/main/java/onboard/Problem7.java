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
        int max_length = values.stream()
                .map(String::length)
                .max(Integer::compare)
                .get();

        for(int i=0; i<max_length; i++){
            for(int j=0; j<values.size();j++){
                if(values.get(j).length()<= i){
                    continue; //j번째행에서 i번째 글자가 null이면 넘어간다.
                }
                answer = answer.concat(values.get(j).substring(i, i + 1));
            }
        }
        return answer;
    }
}
