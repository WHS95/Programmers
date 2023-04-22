import java.util.Arrays;

class Solution {
    public int solution(int[] people, int limit) {
        Arrays.sort(people); // people 배열을 오름차순으로 정렬
        int i = 0, j = people.length - 1; // i는 가장 가벼운 사람, j는 가장 무거운 사람을 가리키는 인덱스
        int answer = 0;
        while (i <= j) { // 가장 가벼운 사람과 가장 무거운 사람을 함께 태울 수 있는지를 계속 확인
            if (people[j] + people[i] <= limit) { // 함께 태울 수 있는 경우
                i++;
            }
            j--; // 가장 무거운 사람은 항상 함께 태우지 않으므로 j만 감소
            answer++; // 구명보트 개수 증가
        }
        return answer;
    }
}
