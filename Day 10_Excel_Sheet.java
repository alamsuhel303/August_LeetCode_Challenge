 class Solution {
    public int titleToNumber(String s) {
        int ans=0;
        char a='A'-1;
        int len=s.length()-1;
        for(int i=0;i<s.length();i++)
        {
        	char c=s.charAt(i);
        	int val=c-a;
        	val=(int) (val*Math.pow(26, len--));
        	ans+=val;
        	
        }
        return ans;
    }
}

