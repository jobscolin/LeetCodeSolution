# 8. String to Integer (atoi)

### 简述一下条件
给定一个字符串，获取字符串中第一个整数
1. 如果第一字符不是'-','+',' ',数字。那么返回0；
2. 如果这个整数大于Integer.MAX_VALUE，那么返回Integer.MAX_VALUE；如果小于Integer.MIN_VALUE那么返回Integer.MIN_VALUE

Example 1:
```
Input: "42"
Output: 42
```
Example 2:
```
Input: "   -42"
Output: -42
```
Example 3:
```
Input: "4193 with words"
Output: 4193
```
Example 4:
```
Input: "words and 987"
Output: 0
```
Example 5:
```
Input: "-91283472332"
Output: -2147483648
```

### 解题思路
第一想法：
1. 输入字符串.trim（）去除头尾空格
2. 遍历字符串直到不符条件，然后通过substring（）裁剪字符串，然后转化为Long
3. 比较整型范围，然后返回相应的值

问题所在：裁剪得到的字符，可能大于Long的范围，那么无法解决问题。(Pass)

再次思考：
1.输入字符串.trim（）去除头尾空格
2.遍历每个字符过程中，所得到的值必然是前一个字符的值得*10+i，那么前一个字符for循环累计+自己，判断所得的值是否超过整型范围（判断条件：如果n>0,那么累计加的n'<n则超出最大范围，如果n<0,n'>n那么超出最小范围）；如果n * 10没有超过那么则进行计算n * 10+i是否超过范围；直到不符合条件
