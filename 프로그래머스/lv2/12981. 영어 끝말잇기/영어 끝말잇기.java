import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = {0, 0};
        Set<String> set = new HashSet<>(); // 이미 말한 단어를 저장할 set
        int turn = 1; // 몇 번째 차례인지
        char lastChar = words[0].charAt(0); // 이전 단어의 마지막 글자

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if (i != 0 && (word.charAt(0) != lastChar || set.contains(word))) {
                // 이전 단어의 마지막 글자와 현재 단어의 첫 글자가 다르거나, 이미 말한 단어일 경우
                answer[0] = turn; // 현재 차례 저장
                answer[1] = (i / n) + 1; // 몇 번째 라운드인지 저장
                break;
            } else {
                set.add(word);
                lastChar = word.charAt(word.length() - 1); // 현재 단어의 마지막 글자 저장
                turn = (turn == n) ? 1 : turn + 1; // 차례 변경
            }
        }

        return answer;
    }
}
