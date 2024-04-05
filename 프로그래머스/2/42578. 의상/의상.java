import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        
        //1.아무것도 입지 않은 경우를 포함한 clothes의 HashMap을 만들어준다.
        HashMap<String, Integer> map = new HashMap<>();
        for (String [] clothe : clothes){
            String type = clothe[1];
            map.put(type, map.getOrDefault(type,1)+1);
        }
        
        //2.clothes의 value값을 다 곱하여 경우의 수를 계산해 준다.
        Iterator<Integer> it = map.values().iterator();
        int answer = 1;
        while (it.hasNext())
            answer*=it.next().intValue();
        return answer-1;
    }
}