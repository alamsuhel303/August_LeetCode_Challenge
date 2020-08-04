
public class Day1 {

	  public boolean detectCapitalUse(String word) {
		  boolean flag=false;
	      if(word.charAt(word.length()-1)>='A'&&word.charAt(word.length()-1)<='Z')
		  for(int i=0;i<word.length();i++)
	      {
	    	  if(word.charAt(i)>='A'&&word.charAt(i)<='Z')
	    	  {
	    		  flag=true;
	    	  }
	    	  else
	    	  {
	    		  flag=false;
	    		  break;
	    	  }
	    	  if(i+1==word.length())
	    		  return flag;
	      }
	      for(int i =0;i<word.length();i++)
	      {
	    	  if(word.charAt(i)>='a'&&word.charAt(i)<='z')
	    	  {
	    		  flag=true;
	    	  }
	    	  else
	    	  {
	    		  flag=false;
	    		  break;
	    	  }
	      }
	      if(word.charAt(0)>='A'&&word.charAt(0)<='Z')
	      {
	    	  for(int i =1;i<word.length();i++)
		      {
		    	  if(word.charAt(i)>='a'&&word.charAt(i)<='z')
		    	  {
		    		  flag=true;
		    	  }
		    	  else
		    	  {
		    		  flag=false;
		    		  break;
		    	  }
		      }     
	      
	      }
		  return flag;
	    }
	public boolean detectCapitalUse1(String word)
	{
		boolean flag=false;
		int count=0;
		for(int i=0;i<word.length();i++)
		{
			if(word.charAt(i)>='A'&&word.charAt(i)<='Z')
				count++;
		}
		if(count==0||count==word.length())
			flag=true;
		else if((word.charAt(0)>='A'&&word.charAt(0)<='Z')&&count==1)
			flag=true;
		
		return flag;
	}
	public boolean detectCapitalUse2(String word)
	{
		return word.matches("[A-Z]*|.[a-z]*");
	}
	public static void main(String[] args) {
		Day1 day = new Day1();
		System.out.println(day.detectCapitalUse2("Google"));
		System.out.println(day.detectCapitalUse2("USA"));
		System.out.println(day.detectCapitalUse2("table"));

	}

}
