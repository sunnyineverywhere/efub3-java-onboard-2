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
        int len1=0, len2=0;

        for(int i=0;i<5;i++) {
            String word=values.get(i);
            if(word.length()>len1) {
                len1=word.length();
            }
        }

        for(int i=0;i<len1;i++) {
            for(int j=0;j<5;j++) {
                String words=values.get(j);
                len2=words.length();
                if(i>=len2) continue;
                answer+=words.charAt(i);
            }
        }

        return answer;
    }
}
