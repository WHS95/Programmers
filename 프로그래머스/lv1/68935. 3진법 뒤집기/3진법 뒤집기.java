import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class Solution {
  public int solution(int n) {
    String threeNum = Integer.toString(n,3);//3진법으로 변환
    ArrayList<String> arrlist = new ArrayList<>(Arrays.asList(threeNum.split("")));
    Collections.reverse(arrlist);
    String str = String.join("", arrlist);
    int tenNum = Integer.parseInt(str,3);//10진법으로 변환
    return tenNum;
}
}