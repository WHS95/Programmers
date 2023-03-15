class Solution {
  public String solution(String cipher, int code) {
    char[] array = cipher.toCharArray();
    String answer = "";
    int len = array.length;
    //String에 각각위치의 값을 가져온후 합하여 리턴한다.
    for(int i = 1; i <= len; i++){
        if((code * i - 1 ) <len){
            answer += Character.toString(array [ code * i -1]);
        } else {
             return answer;
        }
    }
    return answer;
}
}