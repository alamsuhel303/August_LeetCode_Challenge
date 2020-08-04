import java.util.ArrayList;
import java.util.LinkedList;

class MyHashSet
{
	
	private BucketList[] bucket;
	private int range;
	public MyHashSet()
	{
		this.range=769;
		 this.bucket = new BucketList[this.range];
		 for(int i=0;i<range;i++)
			 this.bucket[i] = new BucketList();
	}
	
	public int  genrateindex(int key) {
		int index=0;
			index=key%range;
		return index;
	}
	public void add(int key)
	{
		int index=this.genrateindex(key);
		this.bucket[index].add(key);
	}
	public void remove(int key)
	{
		int index=this.genrateindex(key);
		this.bucket[index].delete(key);
	}
	public boolean contains(int key)
	{
		boolean flag=false;
		int index=this.genrateindex(key);
		flag=this.bucket[index].contains(key);
		return flag;
	}
}

class BucketList{
	private LinkedList<Integer> list;
	public BucketList()
	{
		list=new LinkedList<Integer>();
	}
	public boolean contains(int key) {
		if(this.list.contains(key))
		return true;
		return false;
	}
	public void delete(int key) {
		if(this.list.indexOf(key)!=-1)
			list.remove(key);
		
	}
	public void add(int key) {
		if(this.list.indexOf(key)==-1)
			list.add(key);
		
	}
}
public class Day2 {

	public static void main(String[] args) {
		MyHashSet hashset= new MyHashSet();
		hashset.add(1);
		hashset.add(2);
		System.out.println(hashset.contains(1));
		System.out.println(hashset.contains(3));


	}

}
