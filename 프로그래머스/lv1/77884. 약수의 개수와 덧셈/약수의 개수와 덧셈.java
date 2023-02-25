class Solution {
  public int solution(int left, int right) {
    int answer = 0;
    for (int i = left; i <= right; i++) {
      if (yak(i)) {
        answer += i;
      } else {
        answer -= i;
      }
    }
    return answer;
  }

  public boolean yak(int num) {
    int count = 0;
    for (int i = 1; i <= Math.sqrt(num); i++) {
      if (num % i == 0) {
        if (num / i == i) {
          count += 1;
        } else {
          count += 2;
        }
      }
    }
    return count % 2 == 0; //약수의 개수가 짝수면 true 아니면 false
  }

}