# 5. Longest Palindromic Substring

### Given a string s, find the longest palindromic substring in s. You may assume that the maximum length of s is 1000.

Example 
```
Input: "babad"
Output: "bab"
Note: "aba" is also a valid answer.
Example 2:
```
```
Input: "cbbd"
Output: "bb"
```
给定一个字符串s，找到其中最大回文字符串；所谓回文就是指正反方向读取都是同一个，如"aba","aa","a"

### Solution
解题思路：
遍历一遍字符串s的index，假设这个index为最大回文字符串的中心，那么对其进行两边扩撒比对，直到左边index<0或右边index>s.length()或两边字符不相等为止。时间复杂度O（n^2）
