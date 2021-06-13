public class SinglyLinkedList{
    private Node head;
    public SinglyLinkedList(){
	this.head = null;
    }
    
    public boolean isEmpty(){
	return this.head == null;
    }
    public void add(int value){
	Node newNode = new Node(value);
   	if(head == null){
	    head = newNode;
	}
	else {
		Node runner = head;
		while (runner.next != null){
		    runner = runner.next;
		}
		runner.next = newNode;
	    }
    }
    public void remove(){
	Node runner = head;
	while (runner.next.next != null){
	    runner = runner.next;
	}
	runner.next = null;
    }
    public void printValues(){
	if(isEmpty()){
	    System.out.println("List is empty");
	}
	
	Node runner = this.head;
	while(runner.next != null){
	    System.out.format("Node value: %s , Next value: %s \n", runner.value, runner.next.value);
	    runner = runner.next;
	}
	
    }


}