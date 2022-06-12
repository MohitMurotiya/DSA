class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        int n = spells.length, m = potions.length;
        Arrays.sort(potions);
        int[] ans = new int[n];
        
        for(int i = 0; i < n; ++i){
            long factor = (success + spells[i] - 1) / spells[i]; 
            ans[i] = m - getIndex(potions, factor);;
        }
        return ans;
    }
    
    private static int getIndex(int[] array, long key){
        int i = 0, j = array.length;
        while(i < j){
            int mid = i + (j - i) / 2;
            if(array[mid] < key){
                i = mid + 1;
            } else {
                j = mid;
            }
        }
        return i;
    }
}