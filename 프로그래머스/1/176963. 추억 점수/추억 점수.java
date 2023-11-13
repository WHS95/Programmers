import java.util.*;


class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
       
        //name 과 yearing을 키 밸류의 hash 로 만든다.
        Map<String, Integer> hashMap = new HashMap<>();
        for(int i = 0; i< name.length; i++){
            hashMap.put(name[i], yearning[i]);
        }
        
        int[] answer = new int[photo.length];
        for(int i = 0; i< photo.length; i++){
            int sum = 0;
            for (String person : photo[i]){
                sum += hashMap.getOrDefault(person,0);
            }
            answer[i] = sum;
        }    
        return answer;
    }
}