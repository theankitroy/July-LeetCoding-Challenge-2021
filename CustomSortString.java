class Solution {
    public String customSortString(String order, String str) {
        StringBuilder sb = new StringBuilder();
        HashMap<Character , Integer> map = new HashMap<>();
		
        for(int i = 0 ; i < str.length() ; i++){
            char ch = str.charAt(i);
            map.put(ch , map.getOrDefault(ch , 0)+1);
        }
		
        for(int i = 0 ; i < order.length() ; i++){
            char ch = order.charAt(i);
            if(map.containsKey(ch)){
                int freq = map.get(ch);
                while(freq-- > 0){
                    sb.append(ch);
                }
                map.remove(ch);
            }
        }
        
       for(char ch : map.keySet()){
           int freq = map.get(ch);
           while(freq-- > 0){
               sb.append(ch);
           }
        }
        return sb.toString();
    }
}
