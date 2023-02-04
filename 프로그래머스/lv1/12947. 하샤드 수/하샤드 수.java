class Solution {
  public boolean solution(int x) {
    String strNum = String.valueOf(x);
    String[] strNumArr = strNum.split("");
    int sumArr = 0;
    for (int i = 0; i < strNumArr.length; i++) {
      sumArr += Integer.parseInt(strNumArr[i]);
    }
    return (x%sumArr==0)?true:false;
  }
}