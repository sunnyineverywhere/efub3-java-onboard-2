import onboard.Problem6;
import onboard.Problem7;
import onboard.Problem8;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class ProblemTest {
    @Nested
    class Problem6Test{
        @Test
        void case1(){
            Integer[][] values = {{0, 1, 0, 1}, {1, 1, 1, 0}, {0, 0, 1, 1}};
            List<String> answer = List.of("B", "A", "B");
            assertThat(Problem6.solution(values)).isEqualTo(answer);
        }

        @Test
        void case2(){
            Integer[][] values = {{0, 0, 0, 0}, {1, 1, 1, 1}, {1, 0, 0, 1}};
            List<String> answer = List.of("D", "E", "B");
            assertThat(Problem6.solution(values)).isEqualTo(answer);
        }
    }

    @Nested
    class Problem7Test{
        @Test
        void case1(){
            List<String> values = List.of("ABCDE", "abcde", "01234", "FGHIJ", "fghij");
            String answer = "Aa0FfBb1GgCc2HhDd3IiEe4Jj";
            assertThat(Problem7.solution(values)).isEqualTo(answer);
        }

        @Test
        void case2(){
            List<String> values = List.of("AABCDD", "afzz", "09121", "a8EWg6", "P5h3kx");
            String answer = "Aa0aPAf985Bz1EhCz2W3D1gkD6x";
            assertThat(Problem7.solution(values)).isEqualTo(answer);
        }

        @Test
        void case3(){
            List<String> values = List.of("FGEDDSSE", "02394", "ak", "399387100", "hannah");
            String answer = "F0a3hG2k9aE39nD93nD48aS7hS1E00";
            assertThat(Problem7.solution(values)).isEqualTo(answer);
        }
    }

    @Nested
    class Problem8Test{
        @Test
        void case1(){
            Integer paperNumber = 3;
            Integer[][] locations = {{3, 7}, {15, 7}, {5, 2}};
            Integer answer = 260;
            assertThat(Problem8.solution(paperNumber, locations)).isEqualTo(answer);
        }

        @Test
        void case2(){
            Integer paperNumber = 5;
            Integer[][] locations = {{2, 10}, {4, 4}, {30, 5}, {25, 10}, {10, 10}};
            Integer answer = 415;
            assertThat(Problem8.solution(paperNumber, locations)).isEqualTo(answer);
        }
    }
}
