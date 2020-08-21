

class Solution {
    public int[] distributeCandies(int candies, int num_people) {
        int[] ans = new int[num_people] ;
        int give=1;
        int i=0;
        while(candies!=0)
        {
        	if(give>candies)
        		give=candies;
        	ans[i++%num_people]+=give;
        	candies-=give;
        	give++;
        	
        }
        return ans;
    }
}

