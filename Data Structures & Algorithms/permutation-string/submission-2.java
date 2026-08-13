class Solution {
    public boolean checkInclusion(String s1, String s2) {

        if (s1.length() > s2.length())
            return false;

        int[] freqs1 = new int[26];
        int[] freqs2 = new int[26];

        // Frequency of s1
        for (int i = 0; i < s1.length(); i++) {
            freqs1[s1.charAt(i) - 'a']++;
        }

        int left = 0;
        int right = s1.length();

        // Frequency of first window
        for (int i = 0; i < s1.length(); i++) {
            freqs2[s2.charAt(i) - 'a']++;
        }

        while (right < s2.length()) {

            if (Arrays.equals(freqs1, freqs2))
                return true;

            // Remove character leaving window
            freqs2[s2.charAt(left) - 'a']--;
            left++;

            // Add character entering window
            freqs2[s2.charAt(right) - 'a']++;
            right++;
        }

        // Check the final window
        return Arrays.equals(freqs1, freqs2);
    }
}