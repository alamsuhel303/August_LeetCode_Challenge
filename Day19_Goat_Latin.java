

class Solution {
    public String toGoatLatin(String S) {
    	String[] ans=S.split(" ");
    	String[] goat = new String[ans.length];
    	int i=0;
    	
    	String post="a";
    	String suhel="a";
		for(String p:ans)
		{
			String res;
			char first=p.toLowerCase().charAt(0);
			if(first=='a'||first=='e'||first=='i'||first=='o'||first=='u')
			{
				 res=p+"ma"+suhel;
			}
			else
			{
				res=p.substring(1)+p.charAt(0)+"ma"+suhel;
			}
			goat[i++]=res;
			suhel+=post;
		}
    	


		String finalans ="";
		for(String q:goat)
			finalans+=q+" ";
    	return finalans.substring(0, finalans.length()-2);
    }
}

