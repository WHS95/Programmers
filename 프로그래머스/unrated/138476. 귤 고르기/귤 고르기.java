import java.util.*;

class Solution {
  public int solution(int k, int[] tangerine) {
    // 1. tangerine 배열에 있는 종류별 갯수를 값(키는 인덱스로보고) 형태로 저장한다.
    Map<Integer, Integer> map = new HashMap<>();
    for (int i : tangerine) {
      if (map.containsKey(i)) {
        map.put(i, map.get(i) + 1);
      } else {
        map.put(i, 1);
      }
    }

    Collection<Integer> values = map.values();
    Integer[] array = values.toArray(new Integer[values.size()]);
    Arrays.sort(array, Collections.reverseOrder());

    int count = 1;

    for (int e : array) {
      if (e < k) {
        k = k - e;
        count++;
      } else {
        return count;
      }
    }
    return count; // 결과값 반환
  }
}
