class Solution {
    public boolean isValid(String s) {
        
        Stack<Integer> stack = new Stack<> ();
        
        for (int i=0; i<s.length(); ++i) {
            int ele = s.charAt(i);
            
            if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
                stack.push(ele);
            }
            else {
                if (stack.isEmpty()) {
                    return false;
                }
                if (ele == ')' && stack.peek() == '(') {
                    stack.pop();
                }
                else if (ele == ']' && stack.peek() == '[') {
                    stack.pop();
                }
                else if (ele == '}' && stack.peek() == '{') {
                    stack.pop();
                }
                else break;
            }
        }
        return stack.isEmpty();
    }
}