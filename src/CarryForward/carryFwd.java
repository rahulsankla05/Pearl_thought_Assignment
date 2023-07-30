package CarryForward;

import java.util.Arrays;

public class carryFwd {
    public static void main(String[] args) {
        String[] s = {"a", "g", "a", "g", "f", "g", "g"};
        pairs(Arrays.toString(s));
    }
    public static void pairs(String s){
        int count=0;  // it will count number of "g"
        int ans=0;  // it will give the final number of pairs of "a" with "g"  i!=j and s[i]=='a'  s[j]=='g'
        int n=s.length();
        for(int i=n-1;i>=0;i--){
            char ch =s.charAt(i);
            if(ch == 'g'){
                count++;
            } else if (ch == 'a') {
                ans+=count;
            }else{
                count=count;
            }
        }
        System.out.println(ans);
    }
}
