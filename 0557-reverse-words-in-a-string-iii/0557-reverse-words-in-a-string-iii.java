class Solution {
    public String reverseWords(String s) {
        String arr[]=s.split(" ");
        String st="";
        for(int i=0;i<arr.length;i++){
            String a="";
            for(int j=arr[i].length()-1;j>=0;j--){
                a=a+arr[i].charAt(j);
            }
           if(i==arr.length-1){
               st=st+a;
           }else{
               st=st+a+" ";
           }
        }
        return st;
    }
}