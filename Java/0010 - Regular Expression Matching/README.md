# 9. Regular Expression Matching

### Given an input string (s) and a pattern (p), implement regular expression matching with support for '.' and '*'.

'.' Matches any single character.
'*' Matches zero or more of the preceding element.
The matching should cover the entire input string (not partial).

### Note:

- s could be empty and contains only lowercase letters a-z.
- p could be empty and contains only lowercase letters a-z, and characters like . or *.
- 我觉得这里需要做好前提，假设p的第一个字符不为*，且s和p不为null

Example 1:
```
Input:
s = "aa"
p = "a"
Output: false
```

Example 2:
```
Input:
s = "aa"
p = "a*"
Output: true
Explanation: '*' means zero or more of the precedeng element, 'a'. Therefore, by repeating 'a' once, it becomes "aa".
```
Example 3:
```
Input:
s = "ab"
p = ".*"
Output: true
Explanation: ".*" means "zero or more (*) of any character (.)".
```
Example 4:
```
Input:
s = "aab"
p = "c*a*b"
Output: true
Explanation: c can be repeated 0 times, a can be repeated 1 time. Therefore it matches "aab".
```
Example 5:
```
Input:
s = "mississippi"
p = "mis*is*p*."
Output: false
```
### Solution

- 解法1：递归
目前第一种方法就是采用递归方法，这种方式时间复杂度就是O(p.length^2 + s.length^2 ）
 1. 验证第一个字符是否相等（或者p的第一个字符为'.'），然后判断p的第二字符是否为' * ',
 2. 这个时候不为' * '直接进入下一步裁剪到s和p的第一个字符再次递归验证，
 3. 如归p的第二字符为' * '时，又分2种情况，' * '是0个前一个字符的时候，那么s不变，p裁剪2个字符继续递归，
 4. 如果是1个前一个字符，那么s裁剪1个字符，p不变继续递归


 