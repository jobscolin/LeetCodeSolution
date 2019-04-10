# 7. Reverse Integer

### Given a 32-bit signed integer, reverse digits of an integer.

Example 1:
```
Input: 123
Output: 321
```
Example 2:
```
Input: -123
Output: -321
```
Example 3:
```
Input: 120
Output: 21
```
给定一个Integer整数，返回一个它的倒置整数，注意如果倒置超出返回[-2^31,2^31-1]的话则返回0；

### Solution
解题思路：
1. 将这个整数x除以10并求余，循环直到x等于0； mod=x%10,x=x/10;
2. 求得的余数在每次循环是累计并乘以10;(mod*10)+mod
3. 最终结果用long来存储，并和最大范围进行比较