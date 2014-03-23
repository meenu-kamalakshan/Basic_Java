public class Create_Linked_List {
	
	public static class Node{
		  public String item;
		  public Node next;
		  
		  public void printNode(){
			    System.out.println(item);
			    if (next != null){
			        next.printNode();
			    }
		}
	
	public Node first = null;
	
	public boolean isEmpty(){
	  return first == null; 
	}
	}
	
	public static void main (String[] args){
		Node node1 = new Node();
		Node node2 = new Node();
		Node node3 = new Node();
		Node node4 = new Node();
		
		
		
		node1.item ="H";
		node1.next = node2;
		
		node2.item ="E";
		node2.next = node3;
		
		node3.item ="A";
		node3.next = node4;
		
		node4.item ="D";
		node4.next = null;
		
		node1.printNode();
	}
		
}


