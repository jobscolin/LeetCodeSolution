# 6. ZigZag Conversion

### The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)


```
P   A   H   N
A P L S I I G
Y   I   R
```
And then read line by line: "PAHNAPLSIIGYIR"

Example 1:

```
Input: s = "PAYPALISHIRING", numRows = 3
Output: "PAHNAPLSIIGYIR"
```
Example 2:

```

Input: s = "PAYPALISHIRING", numRows = 4
Output: "PINALSIGYAHRPI"
Explanation:
P     I    N
A   L S  I G
Y A   H R
P     I
```

一个字符串根据numRows列数按Z字型进行排列，最后以横向读取返回字符串

### Solution
解题思路： 查看Z字型发现规律
1. 一个循环的数量是2*numRows-2;
2. 第一行和最后一行的字符index为k* (2*numRows-2)和k *(2 * numRows-2)+numRows-1;
3. 第2行-第numRows-1行中存在2中情况，一种k *(2 * numRows-2)+numRows-1和k *(2 * numRows-2)-
