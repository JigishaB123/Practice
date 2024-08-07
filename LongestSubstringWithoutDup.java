class Solution {
    public int lengthOfLongestSubstring(String s) {
    //     char[] chr = s.toCharArray();
        int l = 0;
        int result = 0;
        Set<Character> substr = new HashSet<>();


        for(int r = 0; r<s.length();r++){
            while(substr.contains(s.charAt(r))){
                substr.remove(s.charAt(l));
                l++;
            }
            substr.add(s.charAt(r));
            result = Math.max(result, r-l+1);
        }


        return result;


    //     for(int i=0; i< chr.length; i++){
    //         if(substr.contains(Character.toString(chr[i]))){
    //             substr.clear();
    //             maxcounter = maxcounter > counter ? maxcounter : counter;
    //             counter = 0;
    //         }
    //             substr.add(Character.toString(chr[i]));
    //             res = Math;
    //     }
    //     return Math.max(maxcounter, counter);
       }
}
