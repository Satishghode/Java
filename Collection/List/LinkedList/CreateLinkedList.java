package LinkedList;
// this is an hard code LinkedList Overview.
public class CreateLinkedList {
	
	public static class Node{
		int data ; 
		Node Next ; 
		
		Node(int data){
			
			this.data= data;
			this.Next = null ;
			
		}
		
	}
	
	public static void main (String args[]) {
		
		Node node = new Node(99);
		Node node1 = new Node(909);
		Node node2 = new Node(990);
		
		node.Next = node1;
		node1.Next= node2;
	
		Node temp = node ; 
		for (int i = 0; i < 2; i++) {
			System.out.print(temp.data +" --> ");
			temp = temp.Next;
		}
		
		
		
		
	}

}
