import java.util.*;

class Solution {
    public int solution(int[] array) {
       int maxNum = Arrays.stream(array).max().getAsInt(); // 배열에서 가장 큰 수 찾기

        int lcm = maxNum;
        boolean found = false;
        
        while (!found) {
            int count = 0;
            for (int i = 0; i < array.length; i++) {
                if (lcm % array[i] == 0) {
                    count++;
                }
            }
            if (count == array.length) {
                found = true;
            } else {
                lcm += maxNum;
            }
        }
        return lcm;
    }
}