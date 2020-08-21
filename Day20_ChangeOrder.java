
  

 
   class Solution{
	    public void reorderList(ListNode head) {
	    	ListNode cur=head;
	    	int count=0;
	    	while(cur!=null)
	    	{
	    		count++;
	    		cur=cur.next;
	    		
	    	}
	    	int term;
	        System.out.println("total nodes are"+count);
	    	if(count%2==0)
	    		term=count/2-1;
	    	else
	    		term=(count-1)/2;
	        int a=1;
	    	for(int i=1;i<=term;i++)
	    	{
	    		head=change(head,a);
	            a=a+2;
	    	}
	    	
	    }
	    private ListNode change(ListNode head,int count)
	    {
	    	ListNode last=head,prev=null;
	    	while(last.next!=null)
	    	{
	    		prev=last;
	    		last=last.next;
	    	}
	    	ListNode tobechanged=head;
	    	for(int i=1;i<count;i++)
	        {
	    		if(count==1)
	                break;
	            tobechanged=tobechanged.next;
	        }
	        System.out.println("Changing "+tobechanged.val);
	        System.out.println("Changed with"+last.val);
	        ListNode temp=tobechanged.next;
	    	tobechanged.next=last;
	    	last.next=temp;
	    	prev.next=null;
	        
	    	return head;
	    }
	}

