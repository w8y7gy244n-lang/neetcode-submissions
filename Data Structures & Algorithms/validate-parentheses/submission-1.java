class Solution {
    public boolean isValid(String s) {
        
        List<Character> stack = new ArrayList<Character>();

        for(int i = 0 ; i < s.length() ; i++){
            if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{'){
                stack.add(s.charAt(i));
            }else{
                if(stack.isEmpty()){
                    return false;
                }
                char iv = stack.get(stack.size() - 1);
                if(s.charAt(i) == ')' && iv == '('){
                    stack.remove(stack.size() - 1);
                }else if(s.charAt(i) == '}' && iv == '{'){
                    stack.remove(stack.size() - 1);
                }else if(s.charAt(i) == ']' && iv == '['){
                    stack.remove(stack.size() - 1);
                }else{
                    return false;
                }
            }
        }
        if(stack.isEmpty()){
            return true;
        }else{
            return false;
        }
    }
}