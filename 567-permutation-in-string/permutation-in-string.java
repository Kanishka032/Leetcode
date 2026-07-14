class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int m=s1.length();
        int n=s2.length();

        if(m>n){
            return false;
        }
        char[]a=s1.toCharArray();
        Arrays.sort(a);
        for(int i=0;i<=n-m;i++){
            char[] b=s2.substring(i, i+m).toCharArray();
            Arrays.sort(b);

            if(Arrays.equals(a,b)){
                return true;
            }
        }
        return false;
    }
}