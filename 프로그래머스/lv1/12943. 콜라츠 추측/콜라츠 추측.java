class Solution {
    public int solution(int num) {
    long n = (long) num;
    int count = 0;
    while (count < 500) {
      if (n == 1) {
        return count;
      }
      if (n % 2 == 0) {
        n = n / 2;
        count += 1;
      } else if (n % 2 == 1) {
        n = (n * 3) + 1;
        count += 1;
      }
    }
    return -1;
  }

}