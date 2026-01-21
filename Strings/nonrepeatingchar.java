package Strings;

public class nonrepeatingchar {
    static char NonRepeating(String s1){
        int[] freq=new int[26];
        for(int i=0;i<s1.length();i++){
            freq[s1.charAt(i)-'a']++;
        }
        for(int i=0;i<s1.length();i++){
            if(freq[s1.charAt(i)-'a']==1){
                return s1.charAt(i);
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        
        String s="aabcc";
        System.out.println(NonRepeating(s));
    }
    
}
