class Solution {
    public boolean isAnagram(String s, String t) {
        if (!(s.length()==t.length())) return false;
        else{
            Map<Character, Integer> freq= new HashMap<>();

            for(int i=0; i<s.length(); i++){
                char ch= s.charAt(i);
                freq.put(ch,freq.getOrDefault(ch,0)+1);
                ch= t.charAt(i);
                freq.put(ch,freq.getOrDefault(ch,0)-1);
            }

            for(int n: freq.values()){
                if(n!=0) return false;
            }
            return true;
        }
    }
}
