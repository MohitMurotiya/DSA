### Approach 1: Using Longest common subsequence (TLE)
​
To find minimum number of delete operation: ***str1.length + str2.length - 2subsquene.length***
​
TC: O(2^max(m,n))
SC: O(max(m+n))
​
```
public int minDistance(String word1, String word2) {
return word1.length() + word2.length() - 2 * lcs(word1, word2, word1.length(), word2.length());
}
private static int lcs(String str1, String str2, int m, int n){
if(m == 0 || n == 0){
return 0;
}
if(str1.charAt(m-1) == str2.charAt(n-1)){
return 1 + lcs(str1, str2, m - 1, n - 1);
} else{
return Math.max(lcs(str1, str2, m - 1, n), lcs(str1, str2, m, n - 1));
}
}
```