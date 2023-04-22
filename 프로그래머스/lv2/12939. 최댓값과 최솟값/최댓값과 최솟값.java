import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

class Solution {
    public String solution(String str) {
        List<Integer> list = new ArrayList<>(str.length() / 2 + 1);
        StringTokenizer st = new StringTokenizer(str, " ");
        while (st.hasMoreTokens()) {
            list.add(Integer.parseInt(st.nextToken()));
        }

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : list) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }

        return  min  + " " + max;
    }
}
