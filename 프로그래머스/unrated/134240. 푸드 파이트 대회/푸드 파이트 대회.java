import java.util.ArrayList;

class Solution {
    public String solution(int[] food) {
        String answer = "";
        ArrayList<Integer> result = new ArrayList<Integer>();
        
        for (int i = 1; i < food.length; i++) {
            int num = food[i] / 2;
            if (num > 0) {
                for (int j = 0; j < num; j++) {
                    result.add(i);
                }
            }
        }
        
        result.add(0);
        
        ArrayList<Integer> result2 = new ArrayList<Integer>();
        for (int e : result) {
            result2.add(e);
        }
        
        for (int k = result.size() - 2; k >= 0; k--) {
            result2.add(result.get(k));
        }
        
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < result2.size(); i++) {
            res.append(result2.get(i));
        }
        
        return res.toString();
    }
}
