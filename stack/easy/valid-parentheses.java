class Solution {
    public boolean isValid(String s) {
        Deque<Character> stack=new ArrayDeque<>();
        Boolean flag=false;
        
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(s.charAt(i)=='('||s.charAt(i)== '{' || s.charAt(i)=='['){
                stack.push(s.charAt(i));
            }
            else{
                if(stack.isEmpty()){
                    return false;
                }
                char top = stack.pop();
                if((ch==')' && top!='(' )||
                (ch=='}' && top!='{' )||
                (ch==']' && top!='[' )){
                    return false;   
                }
            }
        }return stack.isEmpty();
    }
}


        //push the first sybmol into stack if char =="({["
        //if char==")}]" then pop it else return false