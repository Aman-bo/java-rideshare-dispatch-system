public class LinkedQueue<T> {
	    Node<T> front = null;
	    Node<T> rear = null; 
	//TO COMPLETE: define two pointers front and rear

    public void enqueue(T item) {
    	  Node<T> newNode = new Node<>(item);
    	    if (isEmpty()) {
    	        front = newNode;
    	    } else {
    	        rear.setNextNode(newNode);
    	    }
    	        rear = newNode;
    	   
    	}

    //TO COMPLETE    

    public T dequeue() {
    	if (isEmpty()) return null;
        T data = front.getData();
        front = front.getNextNode();
        if (front == null) {
            rear = null;
        }
        return data;
    }

    public T peek() {
    	if (isEmpty()) return null;
        return front.getData();
    }

    public boolean isEmpty() {
    	if(front == null)
    	{
    		return true; }
    	
    	else {
    		
    		return false;
    		
    	}
    }

    public void printQueue() {
    	 Node<T> current = front;
         while (current != null) {
             System.out.println(current.getData());
             current = current.getNextNode();
         }
    }
    
    private class Node<T> {
       private T data; // Entry in queue
       private Node<T> next; // Link to next node
       
       private Node(T dataPortion)
       {
          data = dataPortion;
          next = null;
       } // end constructor
       
       private Node(T dataPortion, Node<T> linkPortion)
       {
          data = dataPortion;
          next = linkPortion;
       } // end constructor
       
       private T getData()
       {
          return data;
       } // end getData
       
       private void setData(T newData)
       {
          data = newData;
       } // end setData
       
       private Node<T> getNextNode()
       {
          return next;
       } // end getNextNode
       
       private void setNextNode(Node<T> nextNode)
       {
          next = nextNode;
       } // end setNextNode
    } // end Node
}