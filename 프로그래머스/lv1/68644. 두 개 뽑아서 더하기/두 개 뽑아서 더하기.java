import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
  public int[] solution(int[] numbers) {

    //array to List
    List<Integer> intList = new ArrayList<>();
    for (int element : numbers) {
      intList.add(element);
    }

    //오름차순으로 정렬
    Collections.sort(intList);
    List<Integer> resultList = new ArrayList<>();
    for (int i = 0; i < intList.size(); i++) {
      for (int j = 0; j < intList.size(); j++) {
        if (j > i) {
          int value = intList.get(i) + intList.get(j);
          boolean isValue = resultList.contains(value);
          if (!isValue) {
            resultList.add(value);
          }
        }
      }
         Collections.sort(resultList);
    }
    //int List  to int array
    int [] answer = resultList.stream().mapToInt(i->i).toArray();
    return answer;
  }

}