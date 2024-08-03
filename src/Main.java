public class Main{
    public static void main(String[] args) {
        
        //STACK
        // Stack myStack = new Stack(4);

        // myStack.getTop();
        // myStack.getHeight();

        // myStack.push(5);
        // myStack.pop();

        // myStack.printStack();

        //Queue
        Queue myQueue = new Queue(0);
        
        // myQueue.getFirst();
        // myQueue.getLast();
        // myQueue.getLength();

        myQueue.enqueue(1);
        // myQueue.enqueue(2);
        // myQueue.enqueue(3);

        
        // myQueue.printQueue();

        System.out.println(myQueue.dequeue().value);
        System.out.println(myQueue.dequeue().value);
        System.out.println(myQueue.dequeue());

    }
}