class Solution {
    public int characterReplacement(String s, int k) {

        int right=0;
        int left=0;
        int [] freq= new int[26];
        Arrays.fill(freq,0);
        int maxfreq=0;
        int maxlen=0;
        int window=0;

        for(right=0; right<s.length(); right++){
            
            char ch=s.charAt(right);
            freq[ch-'A']++;

            maxfreq=Math.max(maxfreq, freq[ch-'A']);
             window = right - left + 1;
             
            if(window-maxfreq > k){
                freq[s.charAt(left)-'A']--;
                left++;
            }
            window = right - left + 1;
            maxlen=Math.max(maxlen, window);
        }
        return maxlen;
    }
}
