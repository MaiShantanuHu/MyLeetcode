class Solution {
    public String defangIPaddr(String address) {
        int n = address.length();
        String replica = "";
        for (int i=0; i<n; ++i) {
            if (address.charAt(i) == '.') {
                replica = replica + "[.]";
                continue;
            }
            replica = replica + address.charAt(i);
        }
        return replica;
    }
}