class Solution {
    public boolean checkInclusion(String s1, String s2) {
        char arr[]=s1.toCharArray();
        Arrays.sort(arr);
        s1=String.valueOf(arr);
        for(int i=0;i<=s2.length()-s1.length();i++){
            String sub=s2.substring(i,i+s1.length());
            char arr1[]=sub.toCharArray();
            Arrays.sort(arr1); 
            String s3=String.valueOf(arr1);
            if(s1.equals(s3)){
                return true;
            }
        }
        return false;
    }
}