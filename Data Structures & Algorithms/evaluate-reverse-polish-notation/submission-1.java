class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack =new Stack<>();
        int a=0;
        int b=0;

        for(String i:tokens){
            if(i.equals("+")){
                a=stack.pop();
                b=stack.pop();
                stack.push(a+b);

            }
            else if(i.equals("*")){
                a=stack.pop();
                b=stack.pop();
                stack.push(a*b);
            }
            else if(i.equals("-")){
                a=stack.pop();
                b=stack.pop();
                stack.push(b-a);
            }
            else if(i.equals("/")){
                a=stack.pop();
                b=stack.pop();
                stack.push(b/a);
            }
            else{
                stack.push(Integer.parseInt(i));
            }
        }
        return stack.pop();
        
    }
}
