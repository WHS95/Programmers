class Solution {
    public int solution(int a, int b, int n) {
      int answer =0;
        
        while (n >= a ) {  // x의 값이 1보다 작을 때까지 반복
            answer += (n / a)  * b; 
             n = (n % a) + (n / a)  * b ;  
        }
        return answer;
    }
}
