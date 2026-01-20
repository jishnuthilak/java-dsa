package Strings;

import javax.swing.plaf.TreeUI;

public class pallindrome {
    static boolean match(String s){
        char[] ch=s.toCharArray();
        int left=0;
        int right=ch.length-1;
        while(left<right){
            if(ch[left]==ch[right]){
                left++;
                right--;
            }
            else{
                return false;
            }
        }
        return true ;
        }
    public static void main(String[] args ){
        String s="amma";
        System.out.println(match(s));
    }
    }
    

