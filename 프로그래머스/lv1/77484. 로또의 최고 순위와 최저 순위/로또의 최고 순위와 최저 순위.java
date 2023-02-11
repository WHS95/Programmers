import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


class Solution {
  public int[] solution(int[] lottos, int[] win_nums) {
    int[] result = new int[2] ;
    int[] ranking = { 6, 6, 5, 4, 3, 2, 1 };
    int zeroCount = 0;
    int equalCount = 0;

    List<Integer> winNumsList = new ArrayList<>();
    for (int j = 0; j < win_nums.length; j++) {
      winNumsList.add(win_nums[j]);
    }
    //lottos의 값이 0이면 카운트
    for (int i = 0; i < lottos.length; i++) {
      int lottoNum = lottos[i];
      if (lottoNum == 0) {
        zeroCount += 1;
        //그외는 win_nums랑 비교하여 일치하면 카운트
      } else if (winNumsList.contains(lottoNum)) {
        equalCount += 1;
      }
    }
    //카운트값에 따라 랭킹 반영
    result[0] = ranking[zeroCount + equalCount];
    result[1] = ranking[equalCount];

    return result;
  }
}