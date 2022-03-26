public class Five {
    public int solve(ArrayList<Integer> A, int B) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int xor = 0;
        int count = 0;
        for(int i = 0 ; i < A.size() ; i++){
            xor = xor^A.get(i);
            if(map.containsKey(xor^B)){
                count+=map.get(xor^B);
            }
            if(xor==B){
                count+=1;
            }
            if(map.containsKey(xor)){
                map.put(xor, map.get(xor)+1);
            }else{
                map.put(xor,1);
            }
        }
        return count;
    }
}
