package linkedlist;

public class List {
	
	Node head;
	
	
	
	public static class Node
	{
		int data;
		Node next;
		
		public Node(int data)
		{
			this.data = data;
			next = null;
		}
			
	}
	
    
	
	public void display()
	{
		Node current = head;
		while(current != null)
		{
			System.out.print(current.data+"  -->  ");
			current = current.next;
			
		}
		System.out.println("  end");
	}
	
	
	
	void insertAtHead()
	{
		Node newNode = new Node(50);
	   //	head = newNode;
		newNode.next =  head;
		head = newNode;
		
	}
	

	public static void main(String[] args) {
		
		
		List l =new List();
		
		Node first = new Node(10);
		Node second = new Node(20);
		Node third = new Node(30);
		Node forth = new Node(40);
		
		l.head = first;
		first.next = second;
		second.next = third;
		third.next = forth;
		
		l.display();
		l.insertAtHead();
		l.display();
		
	}

}
