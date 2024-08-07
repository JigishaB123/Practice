class Solution {
    public boolean isValid(String s) {
        Stack<Character> brackets = new Stack<>();
        Map<Character, Character> lookup = new HashMap<>();
        lookup.put(')','(');
        lookup.put('}','{');
        lookup.put(']','[');


        for(int i=0; i < s.length(); i++){
            char chr = s.charAt(i);
            if(lookup.containsKey(chr)){
                if(!brackets.isEmpty() &&
                lookup.get(chr).equals(brackets.peek())){
                    brackets.pop();
                }else{
                    return false;
                }
            }else{
                brackets.push(chr);
            }
        }
        return brackets.isEmpty();
    }
}
