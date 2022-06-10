Brute force approach: Time Complexity O(n^2)
​
```
for(int i = 0; i < numbers.length - 1; i++){
for(int j = i + 1; j < numbers.length; j++) {
if((numbers[i] + numbers[j]) == target){
ans[0] = i+1;
ans[1] = j+1;
break;
}
}
}
```