class Solution {
    public boolean halvesAreAlike(String s) {
        int mid = (s.length()/2);
        int s1=0, s2=0;
        
        for (int i=0; i<mid; ++i) {
            char a = Character.toLowerCase(s.charAt(i));
            if (a == 'a' || a=='e' || a=='i' || a=='o' || a=='u') s1++;
        }
        for (int i=mid; i<s.length(); ++i) {
            char a = Character.toLowerCase(s.charAt(i));
            if (a == 'a' || a=='e' || a=='i' || a=='o' || a=='u') s2++;
        }
         if (s1 == s2) {
             return true;
        }
        return false;
    }
}