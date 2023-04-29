import java.util.Arrays;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] arr = new int [100];
        int day = 1;
        for(int i = 0; i < progresses.length; i++){
            while(progresses[i] + speeds[i]*day < 100){
                day++;
            }
            arr[day]++;
        }
        return Arrays.stream(arr).filter(i-> i != 0).toArray();
    }
}