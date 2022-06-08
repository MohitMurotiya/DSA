**Approach**
​
i) String itself is a Palindrome -> return 1; (because you can remove them all at once)
ii) Other cases, you can first remove all 'a' and then all 'b' or vice versa (first all 'b' then all 'a') -> return 2;
​
Using StringBuilder:
```
return s.equals(new StringBuilder(s).reverse().toString()) ? 1 : 2;
```
​