# 9. Palindrome Number

### Determine whether an integer is a palindrome. An integer is a palindrome when it reads the same backward as forward.

Example 1:
```
Input: 121
Output: true
```
Example 2:
```
Input: -121
Output: false
```

Example 3:
```
Input: 10
Output: false
```

### Solution

- 解法1：
将输入整数转化为String，比较两侧字符是否相等
- 解法2：
计算x的倒置结果的值是否等x，遍历x>0,x%10,x/10获取。

解法二所用时间较短。
 