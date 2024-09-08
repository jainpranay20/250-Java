class Solution {
    public String mergeAlternately(String word1, String word2) {
        
        int a = word1.length();
        int b = word2.length();
        int c = 0;
        int d = 0;
        StringBuilder sb = new StringBuilder();
        while(c < word1.length() && d<word2.length()){
            sb.append(word1.charAt(c));
            c++;
            sb.append(word2.charAt(d));
            d++;
        }
        while(c<word1.length()){
            sb.append(word1.charAt(c));
            c++;
        }
                while(d<word2.length()){
            sb.append(word2.charAt(d));
            d++;
        }
        
        return sb.toString();
    }
}