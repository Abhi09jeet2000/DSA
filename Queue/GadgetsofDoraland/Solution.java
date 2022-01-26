class Solution
{
    static class Pair{
        int first,second;
        Pair(int a, int b){
            first = a;
            second = b;
        }
    }
    static class MIN implements Comparator<Pair>{
        public int compare(Pair a, Pair b){
            if(a.second>b.second){
                return -1;
            }else if(a.second<b.second){
                return 1;
            }else{
                if(a.first>b.first){
                    return -1;
                }else if(a.first<b.first){
                    return 1;
                }else{
                    return 0;
                }
            }
        }
    }
    ArrayList<Integer>TopK(ArrayList<Integer> array, int k)
    {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i: array){
            map.put(i,map.getOrDefault(i,0)+1);    
        }
        
        PriorityQueue<Pair> pq = new PriorityQueue<>(new MIN());
        for(Map.Entry m : map.entrySet()){
            int key = (int)m.getKey();
            int value = (int)m.getValue();
            pq.add(new Pair(key,value));
        }
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = 0; i<k ; i++){
            ans.add(pq.poll().first);
        }
        
        return ans;
    }
}
