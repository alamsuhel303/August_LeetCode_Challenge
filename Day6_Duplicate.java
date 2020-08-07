//Sorting using one for loop 

class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        for(int i=0;i<nums.length-1;i++)
        {
        	if(nums[i]>nums[i+1])
        	{
        		int temp=nums[i];
        		nums[i]=nums[i+1];
        		nums[i+1]=temp;
        		i=-1;
        	}
        }
        System.out.println(Arrays.toString(nums));
        for(int i=0;i<nums.length-1;i++)
        {
        	if(nums[i]==nums[i+1])
        		ans.add(nums[i]);
        }
        
        return ans;
    }
}


//iF only one number is repeated

class Solution {
    public List<Integer> findDuplicates(int[] nums) {
       List<Integer> ans = new ArrayList<>();
        int slow=0,fast=0;
        System.out.println(Arrays.toString(nums));
        do{
        	slow=nums[slow];
        	fast=nums[nums[fast]];
        }while(nums[slow]!=nums[fast]);
        slow=0;
        while(nums[slow]!=nums[fast])
        {
        	slow=nums[slow];
        	fast=nums[fast];
        	ans.add(nums[slow]);
        	nums[slow]=0;
        	
        }
        
        return ans;
    }
}


//visited number is multiplied by -1  and while iterating if its negative the number is repeated 

class Solution {

    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> ans = new ArrayList<>();

        for (int num : nums) {
            if (nums[Math.abs(num) - 1] < 0) { // seen before
                ans.add(Math.abs(num));
            }
            nums[Math.abs(num) - 1] *= -1;
        }

        return ans;
    }
}





class Solution{
	public List<Integer> findDuplicates(int[] nums)
	{
		List<Integer> ans= new ArrayList<>();
		Set<Integer>  visited = new HashSet<>();
		for(int num:nums)
		{
			
			if(visited.contains(num))
				ans.add(num);
			else
				visited.add(num);
		}
		return ans;
	}
}

