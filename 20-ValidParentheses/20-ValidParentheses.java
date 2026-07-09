// Last updated: 7/9/2026, 9:45:14 AM
class Solution {
   public boolean isValid(String s) {
    char[] stack = new char[s.length()];
    int top = -1;
    for (char c : s.toCharArray()) {
        if (c == '(' || c == '{' || c == '[')
            stack[++top] = c;
        else if (top < 0 || 
            (c == ')' && stack[top] != '(') ||
            (c == '}' && stack[top] != '{') ||
            (c == ']' && stack[top] != '['))
            return false;
        else
            top--;
    }
    return top == -1;
}
}