import java.util.*;

public class Solution {
  public int[] solution(int[] arr) {
    List<Integer> intList = new ArrayList<>();
    intList.add(arr[0]);
    for (int element : arr) {
      if (intList.get(intList.size() - 1) != element) {
        intList.add(element);
      }
    }
    int[] result = new int[intList.size()];
    for (int i = 0; i < intList.size(); i++) {
      result[i] = intList.get(i).intValue();
    }
    return result;
  }
}