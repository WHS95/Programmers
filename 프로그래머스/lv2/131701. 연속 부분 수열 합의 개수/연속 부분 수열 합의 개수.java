import java.util.*;
class Solution {
    public int solution(int[] elements) {
        int answer = 0;
        
        // 부분 수열 크기
        int size = 1;
        Set<Integer> set = new HashSet<>();
        
        // 부분 수열 크기가 elements 길이가 될때까지 반복
        while (size <= elements.length) {
            int sum = 0;
            // 부분 수열의 시작을 set에 추가
            for (int i = 0; i < size; i++) {
                sum += elements[i % elements.length];
                set.add(sum);
            }
            // 시작 인덱스부터 elements 끝까지 한칸씩 밀며 진행 
            for (int i = 0; i < elements.length; i++) {
                sum -= elements[i % elements.length];
                sum += elements[(i + size) % elements.length];
                set.add(sum);
            }
            size++;
        }
        answer = set.size();
        return answer;
    }
}