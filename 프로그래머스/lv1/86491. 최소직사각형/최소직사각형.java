class Solution {
     public int solution(int[][] sizes) {
    //각 배열안에서 큰값을 왼쪽으로 정렬
    for (int i = 0; i < sizes.length; i++) {
      if (sizes[i][0] - sizes[i][1] < 0) {
        int first = sizes[i][0];
        int second = sizes[i][1];
        sizes[i][0] = second;
        sizes[i][1] = first;
      }
    }

    int firstMax = sizes[0][0];
    int secondMax = sizes[0][1];

    //첫번째 값 중 가장큰 값 두번째 값중 가장 큰값 을 가져와서 곱합값을 도출한다.
    for (int i = 1; i < sizes.length ; i++) {
      if (firstMax - sizes[i][0] < 0) {
        firstMax = sizes[i][0];
      }
      if (secondMax - sizes[i][1] < 0) {
        secondMax = sizes[i][1];
      }
    }
    return firstMax * secondMax;
  }
}