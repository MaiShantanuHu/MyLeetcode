class Solution {
    public String addBinary(String a, String b) {
        int c = a.length();
        int d = b.length();
        
        if (c != d) {
            String zeros = "";
            int sub = Math.abs(c - d);
            
            for (int i=0; i<sub; i++) {
                zeros += "0";
            }
            if(c > d) {
                b = zeros + b;
            }
            if (d > c) {
                a = zeros + a;
            }
        }
        
        String ans = "";
        char carry = '0';
        for (int i = a.length()-1; i>=0; --i) {
            if (a.charAt(i)=='0' && b.charAt(i)=='0') {
                if (carry == '0') {
                    ans += '0';
                    carry = '0';
                }
                else if (carry == '1') {
                    ans += '1';
                    carry = '0';
                }
            }
            else if (a.charAt(i)=='0' && b.charAt(i)=='1' || a.charAt(i)=='1' && b.charAt(i)=='0') {
                if (carry == '0') {
                    ans += '1';
                    carry = '0';
                }
                else if (carry == '1') {
                    ans += '0';
                    carry = '1';
                }
            }
            else if (a.charAt(i)=='1' && b.charAt(i)=='1') {
                if (carry == '0') {
                    ans += '0';
                    carry = '1';
                }
                else if (carry == '1') {
                    ans += '1';
                    carry = '1';
                }
            }
        }
        if (carry == '1') {
            ans = ans +carry;
        }
        String nstr = ""; 
        for (int i=0; i<ans.length(); i++) {
            char ch= ans.charAt(i); 
            nstr= ch+nstr; 
        }
        
        return nstr;
    }
}