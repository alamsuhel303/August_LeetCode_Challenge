class Solution {
	
	List<Integer> sum= new ArrayList<Integer>();
	int[][] rects;
	Random r = new Random();
    public  Solution(int[][] rects) {
        this.rects=rects;
        int total =0;
        for(int[] a:rects)
        {
        	 total += (a[2]-a[0]+1)*(a[3]-a[1]+1);
        	sum.add(total);
        }
    }
    
    public int[] pick() {
        int target=r.nextInt(sum.get(sum.size()-1));
        int low=0,high=sum.size()-1,mid;
        while(low<high)
        {
        	mid=(low+high)/2;
        	if(target>=sum.get(mid))
        		low=mid+1;
        	else
        		high=mid;
        }
        int[] point=rects[low];
        int x1=point[0];
        int y1=point[1];
        int x2=point[2];
        int y2=point[3];
        int x=r.nextInt(x2-x1+1);
        int y=r.nextInt(y2-y1+1);
        return  new int[]{x+x1,y+y1};
    }
}