import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Arrays;

class Solution {
public String solution(String s) {
    String[] StrArr = s.split("");
    Arrays.sort(StrArr, Collections.reverseOrder());//내림차순

    //java array to string
    return String.join("", StrArr);
}
}