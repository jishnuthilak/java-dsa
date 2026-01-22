package Strings;

import java.util.HashMap;

public class LongestSubstringKDistinct {
    static int LongestSubstring(String s,int k){
        HashMap<Character,Integer> map=new HashMap<>();
        int left=0;
        int right=0;
        int maxlen=0;
        while(right<s.length()){
            char current=s.charAt(right);

            // add current char to map
            map.put(current,map.getOrDefault(current,0)+1);

            // shrink window if invalid
            while(map.size()>k){
                char leftchar=s.charAt(left);
                map.put(leftchar,map.get(leftchar)-1);
                if(map.get(leftchar)==0){
                    map.remove(leftchar);
                }
                left++;
            }
            maxlen=Math.max(maxlen, (right-left)+1);
            right++;

        }
        return maxlen;
    }
    public static void main(String[] args) {
        String s="eceba";
        int k=2;
        System.out.println(LongestSubstring(s,k));
    }
    
}
