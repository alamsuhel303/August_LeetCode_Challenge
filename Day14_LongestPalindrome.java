class Solution {
    public int longestPalindrome(String s) {
    	HashMap<Character, Integer> ans = new HashMap<Character, Integer>();
    	for(int i=0;i<s.length();i++)
    	{
    		char c=s.charAt(i);
    		if(ans.containsKey(c))
    		{
    			int val=ans.get(c);
    			ans.put(c, val+1);
    		}
    		else
    			ans.put(c, 1);
    	}
    	Set<Character> p=ans.keySet();
    	int count=0;
    	boolean single=false,more=false;
        for(char q:p)
        {
        	int val=ans.get(q);
        	if(val%2==0)
        		count+=val;
        	else
        	{
        		if(val>1){
        			count+=val-1;
                    more=true;
                }
        		else
        			single=true;
        	}
        }
        if(single==true)
        	count+=1;
        else if(more==true)
            count+=1;
        return count;
    }
}