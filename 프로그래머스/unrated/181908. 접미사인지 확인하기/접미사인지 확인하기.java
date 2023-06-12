class Solution {
    public int solution(String my_string, String is_suffix) {
        if(my_string.length() < is_suffix.length()){
            return 0;
        }
        
        String suffix = my_string.substring(my_string.length() - is_suffix.length());
            
            if(is_suffix.equals(suffix)){
                return 1;
            } else{
                return 0;
            }
    }
}