import java.util.*;
public class Stack_list
{
	
	private ListNode top;
	private int length;
	
	private class ListNode
	{
		
		private int data;
		private ListNode next;
		
		
		public ListNode(int data)
		{
			this.data=data;
			//this.next=null;
		}
		
	}
	
	public Stack_list()
	{
		top=null;
		length=0;
	} 
	
	public int length()	//return the length of the stack
	{
		return length;
	}
	//whether the stack is empty or not
	public boolean is_empty()
	{
		return length==0;
			
	}	
	
	public void push(int data)
	
	{
		ListNode temp = new ListNode(data);
		temp.next=top;
		top=temp;
		length++;
	}
	
	public int pop()
	{
		if(is_empty())
		{
			throw new EmptyStackException();
		}
		
		int result=top.data;
		top=top.next;
		length--;
		return result;
		
	}
	
	public int peek()
	{
		if(is_empty())
		{
			throw new EmptyStackException();
		}
		
		return top.data;
		
		
	}
	
	public static void main(String []args)
	
	{
		Stack_list obj = new Stack_list();
		
		
		obj.push(12);
		//obj.push(34);
		//obj.push(54);
		
		System.out.print(obj.peek());
		//System.out.println(obj.length());
		
		
	}
	
}