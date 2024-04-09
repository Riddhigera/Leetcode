class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        
        int n=tickets.length;
        int count=0;
        while(true){
            for(int i=0;i<n;i++){
                if(tickets[i]!=0){
                    count+=1;
                    tickets[i] -=1;
                    if(tickets[k]==0){
                        break;
                    }
                    
                }
            }
            if(tickets[k]==0){
                        break;
                    }
        }
        return count;
    }
}
