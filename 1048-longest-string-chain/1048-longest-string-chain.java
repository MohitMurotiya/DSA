import java.util.*;
class Solution {
    public int longestStrChain(String[] words) {
        Arrays.sort(words, (a,b) -> a.length() - b.length()); //Ascending order
        Map<String, Integer> dp = new HashMap<>();
        
        int res = 0;
        for(String word : words){
            int best = 0;
            for(int i = 0; i < word.length(); i++){
                String prev = word.substring(0, i) + word.substring(i + 1); // remove one character
                best = Math.max(best, dp.getOrDefault(prev, 0) + 1);
            }
            dp.put(word, best);
            res = Math.max(res, best);
        }
        return res;
    }
}