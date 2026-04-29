class Solution {
    public boolean isValid(String s) {
        Deque<Character> stack=new ArrayDeque<>();
        int n=s.length();
        for(int i=0;i<=n-1;i++)
        {
            if(s.charAt(i)=='('||s.charAt(i)=='{'||s.charAt(i)=='[')
            stack.push(s.charAt(i));
            else{
                if (stack.isEmpty()) return false;
                if(s.charAt(i)==')')
                {
                    if(stack.peek()=='(')
                    stack.pop();
                    else
                    return false;
                }
                else if(s.charAt(i)==']')
                {
                    if(stack.peek()=='[')
                    stack.pop();
                    else
                    return false;
            }
            else if(s.charAt(i)=='}')
                {
                    if(stack.peek()=='{')
                    stack.pop();
                    else
                    return false;
        }
        

    }
}

 return stack.isEmpty();
    }
}

