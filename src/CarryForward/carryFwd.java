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
//        from Left to Ryt s[i]=="a" cnt++ and s[i]=="g" then ans=ans+count
//        from ryt to left s[i]=="g"  cnt++ and s[i]=="a" then ans+count
        for(int i=0;i<n;i++){
            char ch =s.charAt(i);
            if(ch == 'a'){
                count++;
            } else if (ch == 'g') {
                ans+=count;
            }
        }
        System.out.println(ans);
    }
}
