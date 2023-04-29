import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();

        // 1. progresses 배열에 담겨있는 값을 100에 빼준 값으로 변경한다.
        int[] remainDays = new int[progresses.length];
        for (int i = 0; i < progresses.length; i++) {
            remainDays[i] = (int) Math.ceil((100 - progresses[i]) / (double) speeds[i]);
        }

        // 2. 변경된 progresses 배열의 값을 speeds 값으로 나눈다. (나머지가 발생 시 올림한다.)
        Stack<Integer> stack = new Stack<>();
        for (int i = remainDays.length - 1; i >= 0; i--) {
            stack.push(remainDays[i]);
        }

        // 3. 2번에서 만들어진 배열을 stack에 넣으면서 카운터를 한다.
        int count = 0;
        int prevDay = 0;
        while (!stack.isEmpty()) {
            int curDay = stack.pop();
            if (prevDay >= curDay) {
                count++;
            } else {
                if (count > 0) {
                    list.add(count);
                    count = 0;
                }
                prevDay = curDay;
                count++;
            }
        }
        list.add(count);

        // 4. 결과 리스트를 배열로 변환한다.
        answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}
