class Solution {
    public String minWindow(String s, String t) {

        //create frequency map for t
        Map<Character, Integer> need = new HashMap<>();

        for(int i=0; i<t.length(); i++){
            char ch = t.charAt(i);
            need.put(ch,need.getOrDefault(ch, 0)+ 1);
        }

        //frequency map for variable sliding window through s
        Map<Character, Integer> window = new HashMap<>();

        //size of need 
        int reqd= need.size();
        int have=0;

        int left=0;
        int right=0;

        int minLen=Integer.MAX_VALUE;
        int start=0;

        for(right =0; right<s.length(); right++){

            char ch= s.charAt(right);

            window.put(ch,window.getOrDefault(ch,0)+1);
            if(window.get(ch).equals(need.get(ch))){
                have++;
            }

            
            while(have==reqd){
                int windowLen=right-left+1;

                if(windowLen<minLen){
                    minLen=windowLen;
                    start=left;}


                char leftChar = s.charAt(left);
                
                if(window.get(leftChar).equals(need.get(leftChar))){
                    have--;
                }
                window.put(leftChar,window.getOrDefault(leftChar,0)-1);
                left++;
            }
        }

         if (minLen == Integer.MAX_VALUE) {
            return "";
        }
        return s.substring(start, start+minLen);        
    }
}
