// A class to represent a queue
class Queue{
    private int[] arr;      // array to store queue elements
    private int front;      // front points to the front element in the queue
    private int rear;       // rear points to the last element in the queue
    private int capacity;   // maximum capacity of the queue
    private int count;      // current size of the queue
    // Constructor to initialize a queue
    Queue(int size){
        arr = new int[size];
        capacity = size;
        front = 0;
        rear = -1;
        count = 0;
    }
   // Utility function to dequeue the front element
    public int dequeue(){
        // check for queue underflow
        if (isEmpty()){
            System.out.println("Underflow");
            System.exit(-1);
        }
        int x = arr[front];
        System.out.println("Removing " + x);
        front = (front + 1) % capacity;
        count--;
        return x;
    }
    // Utility function to add an item to the queue
    public void enqueue(int item){
        // check for queue overflow
        if (isFull()){
            System.out.println("Overflow");
            System.exit(-1);
        }
       System.out.println("Inserting " + item);
        rear = (rear + 1) % capacity;
        arr[rear] = item;
        count++;
    }
    // Utility function to return the front element of the queue
    public int peek(){
        if (isEmpty()){
            System.out.println("Underflow");
            System.exit(-1);
        }
        return arr[front];
    }
    // Method to get rear of queue
   public int rear(){
        if (isEmpty()){
        System.out.println("Underflow");
        System.exit(-1);
        }
        return arr[rear];
    }
    // Utility function to return the size of the queue
    public int size() {
        return count;
    }
   // Utility function to check if the queue is empty or not
    public boolean isEmpty() {
        return (size() == 0);
    }
    // Utility function to check if the queue is full or not
    public boolean isFull() {
        return (size() == capacity);
    }
}
class Main{
    public static void main (String[] args){
        // create a queue of capacity 5
        Queue q = new Queue(5);
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        System.out.println("The front element is " + q.peek());
        System.out.println("The rear element is " + q.rear());
        q.dequeue();
        System.out.println("The front element is " + q.peek());
        System.out.println("The queue size is " + q.size());
        q.dequeue();
        q.dequeue();
       if (q.isEmpty()) {
            System.out.println("The queue is empty");
        }else {
            System.out.println("The queue is not empty");
        }
        System.out.println("Anamika Rawat\n CSE-C \n Roll No.- 180");
    }
}
