package linkedlist;

public class LinkedList {
	
      private Node head;
	
	
	//  Creating a  static class node which consists two properties one is data 
    //  and second is address to the next node.
      
	public static class Node     
	{	
			private int data;
			private Node next;
		
			public Node(int data)
			{
			this.data = data;
			this.next = null;
						
			}
		
	}

	
	// Creating a method to display the linked list
	
	 public void displayList() 
	 {
		 
		 System.out.println("Your Linked List contains the following data.....");
		 Node current = head;
		 
		 while(current != null) 
		 {
			 System.out.print(current.data+" --> ");
			 current = current.next;
		 }
		 	 System.out.print("Null");
	}
	
	 	
   // creating a method to find the length of the linked list.	 
	 
	 public void length()
	 {
		 
		 if(head == null)
		 {
			 System.out.println("Length of the linked list is - 0 ");
		 }
		 Node current = head;
		 int count = 0;
		 while(current != null)
		 {
			 count++; 
			current = current.next;
		 }
		 
		 System.out.println("\n\nLength of Linked list is : "+count);
		 
	}
	
	
	
	//creating a method to insert a new node at the begining of the linked list. 
	 
	 public void insertAtBegining(int data)
	 {
		 System.out.println("\nInserting a new Node at the begining of the linked list");
		 
		 Node newNode  = new Node(data);
		 
		 newNode.next = head;
		 head = newNode;
		 
 		 
		 
	 }
	
	
	public static void main(String[] args) 
	   {
		
		LinkedList ls = new LinkedList();
		
		ls.head  = new Node(10);
		Node second = new Node(20);
		Node third = new Node(30);
		Node forth = new Node(40);
		Node fifth = new Node(50);
		
		ls.head.next = second;
		second.next = third;
		third.next = forth;
		forth.next  = fifth;
		
		ls.displayList();
		ls.length();
		ls.insertAtBegining(60);
		
		System.out.println("\n");
		
		ls.displayList();
		ls.length();

	   }
	
	

 }


	