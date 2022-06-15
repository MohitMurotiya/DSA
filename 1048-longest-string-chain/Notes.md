### Approach: Using DP

For each word, loop on all possible previous word with 1 letter missing.
If we have seen this previous word, update the longest chain for the current word.

**Example**: ["xbc","pcxbcf","xb","cxbc","pcxbc"];

```
[xb, xbc, cxbc, pcxbc, pcxbcf]
word: xb | prev: b | best: 1 | prev: x | best: 1 | res: 1
word: xbc | prev: bc | best: 1 | prev: xc | best: 1 | prev: xb | best: 2 | res: 2
word: cxbc | prev: xbc | best: 3 | prev: cbc | best: 3 | prev: cxc | best: 3 | prev: cxb | best: 3 | res: 3
word: pcxbc | prev: cxbc | best: 4 | prev: pxbc | best: 4 | prev: pcbc | best: 4 | prev: pcxc | best: 4 | prev: pcxb | best: 4 | res: 4
word: pcxbcf | prev: cxbcf | best: 1 | prev: pxbcf | best: 1 | prev: pcbcf | best: 1 | prev: pcxcf | best: 1 | prev: pcxbf | best: 1 | prev: pcxbc | best: 5 | res: 5
5
```
