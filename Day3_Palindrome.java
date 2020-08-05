
public class Day3_Palindrome {
	
public boolean isPalindrome(String s) {
		Boolean flag=true;
		//s=s.replace(".[]{}",' ' );
		String ans=s.replaceAll("[ ,!@#$%^&*:\"_ ]", "").toLowerCase();
		System.out.println(ans);
		int j=0;
		for(int i=ans.length()-1;i>=0;i--)
		{
			if(ans.charAt(i)!=ans.charAt(j++))
				return false;
		}
		
		return flag;
        
    }

public boolean isPalindrome(String s)
{
	boolean flag=true;
	StringBuilder str = new StringBuilder();
	for( int i=0;i<s.length();i++)
	{
		if(Character.isLetterOrDigit(s.charAt(i)))
			str.append(s.charAt(i));
	}
	s=str.toString();
	s=s.toLowerCase();
	System.out.println(s);
	int j=0;
	for(int i=s.length()-1;i>=0;i--)
	{
		if(s.charAt(i)!=s.charAt(j++))
			return false;
	}

	
	return flag;
	
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Day3_Palindrome d = new Day3_Palindrome();
		System.out.println(d.isPalindrome1("a A ._[ ]"));

	}

}
