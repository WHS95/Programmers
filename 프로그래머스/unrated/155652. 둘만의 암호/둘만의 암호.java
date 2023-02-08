class Solution {
  public String solution(String s, String skip, int index) {
    char[] words = s.toCharArray();
    for (int i = 0; i < words.length; i++) {
      //index값 만큼 1번씩 값증가 
      for (int j = 0; j < index; j++) {
        //1번더한값을 기준으로 skip에 있는 값이랑비교
        do {
          words[i]++;
          if (words[i] > 'z') { //범위 초과시 a로 돌아옴
            words[i] -= 26; // == 'a'와 동일
          }
          //  skip에 있는 값과 동일 할시 do 구문진행(값 1더 증가)
          // skip에 있는 값과 불일치 할시 do 구문 진행안함 (값 변경 없음)
        } while (skip.contains(String.valueOf(words[i])));
      }
    }
    String answer = String.valueOf(words);
    return answer;
  }
}