import java.util.ArrayList;

class Solution {
      public long solution(int n) {

    ArrayList<Long> result = new ArrayList<Long>();
    result.add(1L);
    result.add(2L);
    if (n == 1) return 1 % 1234567;
    if (n == 2) return 2 % 1234567;
    // if(n ==2) answer + 1;
    if (n > 2) {
      for (int i = 2; i < n; i++) {
        int arrSize = result.size();
        Long a = result.get(arrSize - 2);
        Long b = result.get(arrSize - 1);
        Long sum = (a+b) % 1234567;
        result.add(sum);
      }
    }
    int arrSize = result.size();
    return result.get(arrSize - 1);
  }
}