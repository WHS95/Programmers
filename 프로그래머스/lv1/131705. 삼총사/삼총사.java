class Solution {
  public int solution(int[] number) {
    int answer = 0;
    int len = number.length;
    //number에 있는 숫자 3개 선택
    //하나의 숫자를 선택하면 그것을 제외 하 2개를 선택해야함래
    for (int i = 0; i < len; i++) {
      for (int j = i + 1; j < len ; j++) {
        for (int k = j + 1; k < len ; k++) {
          int a = number[i];
          int b = number[j];
          int c = number[k];
          if ((a + b + c) == 0) answer++;
        }
      }
    }
    return answer;
  }
}