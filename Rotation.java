import java.util.Scanner;
public class Rotation
{ 
	Node head;
	class Node 
	{ 
		int data; 
		Node next; 
		Node(int d) 
		{ 
			data = d; 
			next = null; 
		} 
	} 
	void rotate(int k) 
	{ 
		if (k == 0) return; 
		Node current = head; 
		int count = 1; 
		while (count < k && current != null) 
		{ 
			current = current.next; 
			count++; 
		} 
		if (current == null) 
			return; 
		Node kthNode = current; 
		while (current.next != null) 
			current = current.next; 
		current.next = head; 
		head = kthNode.next; 
		kthNode.next = null; 

	} 
	Rotation insert(Rotation li,int data)
	{
		Node newNode= new Node(data);
		newNode.next=null;
		if(li.head==null)
			li.head=newNode;
		else
		{
			Node last=li.head;
			while(last.next!=null)
			{
				last=last.next;
			}
			last.next=newNode;
		}
		return li;
	}
	void printList() 
	{ 
		Node temp = head; 
		while(temp != null) 
		{ 
			System.out.print(temp.data+" "); 
			temp = temp.next; 
		} 
		System.out.println(); 
	} 
	public static void main(String args[]) 
	{ 
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of linked list:");
		int n=sc.nextInt();
		Rotation li = new Rotation(); 
		System.out.println("Enter elements of Linked list:");
		for (int i = 0; i<n; i++) 
		{
			int element=sc.nextInt();
			li.insert(li,element); 
		}
		System.out.println("Enter rotation:");
		int k=sc.nextInt();
		li.rotate(k); 
		System.out.println("Rotated Linked List"); 
		li.printList(); 
	} 
}
