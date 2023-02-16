import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

class Solution {
  public String solution(String s) {

    List<String> StrList = new ArrayList<>();
    String[] StrArr = s.split("");
    for (int i = 0; i < s.length(); i++) {
      StrList.add(StrArr[i]);
    }
    Collections.sort(StrList, Collections.reverseOrder());//내림차순

    //java list to string
    return StrList.stream().collect(Collectors.joining(""));
  }
}