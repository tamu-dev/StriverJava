class Solution {
    public int characterReplacement(String s, int k) {
        int ans = 0;
        for(int q=0;q<26;q++){
            char ch = (char) ('A'+ q);
            int j=0, i=0, m=k;
            while(i<s.length()){
                if(s.charAt(i) != ch)   m--;
                i++;
                while(m<0){
                    if(s.charAt(j) != ch)   m++;
                    j++;
                }
                ans = Math.max(ans,i-j);
            }
        }
        return ans;
    }
}