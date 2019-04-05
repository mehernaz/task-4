import java.util.*;
public class t5 {
	node head;
	class node
	{
		int d;
		node next;
		node(int d)
		{
			this.d=d;
			next=null;
		}
	}
	void middle()
	{
		node s=head,p=head;
		if(head!=null)
		{
			while(p!=null && p.next!=null)
			{
				s=s.next;
				p=p.next.next;
			}
			System.out.println(s.d);
		}
	}
	void push(int data)
	{ 
		node n=new node(data);
		n.next=head;
		head=n;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		t5 l=new t5();
		Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
for(int i=n;i>0;i--)
{
	l.push(i);
}
l.middle();
	}

}
