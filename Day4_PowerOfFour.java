//Converting the number into base of 4 and check if the number contains only one digit as 1 and rest as 0

public class Day4 {

	 public boolean isPowerOfFour(int num) {
		 boolean flag=false;
		 int temp=num,dig,four=0,i=1;
		 while(temp>0)
		 {
			 num=temp%4;
			 four=four+num*i;
			 temp/=4;
			 i=i*10;
		 }
		 num=0;
		 temp=0;
		 String ans=four+"";
		 System.out.println(ans);
		for(i=0;i<ans.length();i++)
		{
			if(ans.charAt(i)=='0')
				num++;
			else if(ans.charAt(i)=='1')
			{
				temp++;
				if(temp>1)
					return flag;
			}
			else
				return flag;
		}
		if(num+1==ans.length()&&temp==1)
			flag=true;
		return flag;
}
	

//basic mathematical approach

public boolean isPowerOfFour(int num)
{
	
	if(num==0) return false;
	while(num%4==0)
		num/=4;
	if(num==1)
		return true;
	return false;
	
}

//Logarithmic approach
public boolean isPowerOfFour(int num)
{
	double i=Math.log(num)/Math.log(4);
	double ans=i-(int)i;
	if(ans==0)
		return true;
	return false;
	
}
	 
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Day4 d = new Day4();
		System.out.println(d.isPowerOfFour2(1048576));
	}

}
