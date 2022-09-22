class Solution {
    public String reverseWords(String s) {
        String res = "";
        String str = "";
        for(int i=0;i<s.length();i++)
        {   
            if(s.charAt(i)==' '){
                res+=reverse(str);
                res+=" ";
                str="";
                continue;
            }
            str+=s.charAt(i);
        }
        res+=reverse(str);
        return res;
    }
    
    static String reverse(String str){
        char ch;
        String rev="";
        for (int i=0; i<str.length(); i++)
      {
        ch= str.charAt(i);
        rev= ch+rev;
      }
        return rev;
    }
}