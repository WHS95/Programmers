import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(String s) {
        List<Integer> answer = new ArrayList<>();

        List<String> arr = new ArrayList<>();
        List<String> arr2 = new ArrayList<>();
        
        // Split the string into individual characters
        for (String data : s.split("")) {
            // Check if data value exists in arr2
            if (!arr2.contains(data)) {
                answer.add(-1);
                arr2.add(0, data);
            } else {
                int index = arr2.indexOf(data) + 1;
                answer.add(index);
                arr2.add(0, data);
            }
        }
        
        // Convert the answer list to an array
        int[] result = new int[answer.size()];
        for (int i = 0; i < answer.size(); i++) {
            result[i] = answer.get(i);
        }
        
        return result;
    }
}
