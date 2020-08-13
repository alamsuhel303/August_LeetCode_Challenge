

class Solution{
    public List<Integer> getRow(int rowIndex) {
        List<Integer> prev = new ArrayList<Integer>();
        List<Integer> res= new ArrayList<Integer>();
        prev.add(1);
        res.add(1);
        for(int i=1;i<=rowIndex;i++)
        {
        	res.clear();
        	res.add(1);
        	for(int j=0;j<prev.size()-1;j++)
        	{
        		
        		res.add(prev.get(j)+prev.get(j+1));
        		
        		
        	}
        	res.add(1);
        	prev= new ArrayList<Integer>(res);
        }
        return res;
        
    }
}
