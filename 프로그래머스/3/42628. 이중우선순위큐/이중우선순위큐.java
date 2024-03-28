import java.util.*;

class Solution {
    public int[] solution(String[] operations) {
        int[] answer = {0,0};
        PriorityQueue<Integer> prmin = new PriorityQueue<Integer>();
        PriorityQueue<Integer> prmax = new PriorityQueue<Integer>(Collections.reverseOrder());
        
        for(int i=0; i<operations.length; i++){
            if(operations[i].split(" ")[0].equals("I")){
                prmin.add(Integer.parseInt(operations[i].split(" ")[1]));
                prmax.add(Integer.parseInt(operations[i].split(" ")[1]));
            } else if (operations[i].split(" ")[0].equals("D")){
                // pr size != 0;
                if (prmin.size() != 0 && prmax.size() != 0) {
                    if ( operations[i].split(" ")[1].equals("1")){
                        // D == 1
                        int max =prmax.poll();
                        prmin.remove(max);
                    } else if (operations[i].split(" ")[1].equals("-1")) {
                        // D == -1
                        prmin.poll();
                        
                    } 
                }
            }
        }
        
        if (prmin.size() != 0 && prmax.size() != 0){
            answer[0] = prmax.poll();
            answer[1] = prmin.poll();
        }
      
        return answer;
    }
}