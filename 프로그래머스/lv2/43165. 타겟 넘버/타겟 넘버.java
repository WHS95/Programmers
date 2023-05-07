class Solution {
 public int solution(int[] numbers, int target) {
        return dfs(numbers, target, 0, 0);
    }
    
    private int dfs(int[] numbers, int target, int sum, int index) {
        if (index == numbers.length) {
            if (sum == target) {
                return 1;
            }
            return 0;
        }
        
        int count = 0;
        count += dfs(numbers, target, sum + numbers[index], index + 1); // 현재 숫자를 더한 경우
        count += dfs(numbers, target, sum - numbers[index], index + 1); // 현재 숫자를 뺀 경우
        
        return count;
    }
}