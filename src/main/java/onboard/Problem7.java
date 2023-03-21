package onboard;

import java.util.*;
import java.util.stream.Collectors;

/**
 * 백준 10798
 * name: 세로읽기
 * 브론즈 1
 * link : https://www.acmicpc.net/problem/10798
 */
public class Problem7 {
    public static String solution(List<String> values){
        String answer = "";
        List<Character> characters = new ArrayList<>();
        int maxLen = values.stream().mapToInt(String::length).max().getAsInt();

        for (int i = 0; i < maxLen; i++) {
            for (String value : values) {
                if (value.length() > i) {
                    characters.add(value.charAt(i));
                }
            }
        }
        return characters.stream().map(String::valueOf).collect(Collectors.joining());
    }
}
