import java.util.*;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        Queue<Integer> que = new LinkedList<Integer>();
        int sum = 0;
        
        for(int truck : truck_weights){
            while(true){
                if(que.isEmpty()){ //다리가 완전히 비어있을 경우. -> truck++, answer++, sum+=truck
                    que.add(truck);
                    answer+=1;
                    sum=truck;
                    break;
                } else if ( que.size() == bridge_length ){ // 다리가 꽉차있을경우. -> 트럭한대 빼줌.
                    sum -= que.poll();
                } else { // 다리에 트럭이 한대라도 있을 경우 
                    if( sum + truck <= weight){// 다리에 있는 트럭의 무게+다음트럭무게가 다리 중량이 안넘을 경우
                        que.add(truck);         // -> 트럭한대 더해주고 총 중량 + 시간 더해줌
                        sum+=truck;
                        answer+=1;
                        break;
                    } else {                    // -> 이외 경우 0을 다리에 넣어줘서 다리건너게만듬
                        que.add(0);
                        answer+=1;
                    }
                }
            }
            
        }
        return answer+bridge_length;            // 시간 + 다리길이
    }
}