class Solution {
  public String solution(String s, int n) {
    String answer = "";
    char[] arrCh = s.toCharArray();
    for (int i = 0; i < arrCh.length; i++) {
      if (arrCh[i] >= 97) {
        answer +=
          (arrCh[i] + n) > 122 ? (char) (arrCh[i] + n - 26) : (char) (arrCh[i] + n);
      } else if (arrCh[i]== 32) {
        answer += " ";
      } else {
        answer +=
          (arrCh[i] + n) > 90 ? (char) (arrCh[i] + n- 26) : (char) (arrCh[i] + n);
      }
    }
    return answer;
  }
}