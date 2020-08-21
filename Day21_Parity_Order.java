class Solution {
    public int[] sortArrayByParity(int[] A) {
        int[] ans = new int[A.length];
        int i=0;
        int j=A.length-1;
        for(int a:A)
        {
        	if(a%2==0)
        		ans[i++]=a;
        	else
        		ans[j--]=a;
        }
        return ans;
    
    }
}