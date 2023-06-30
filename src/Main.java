// new file create
public class Main {
    public static void main(String[] args) {
        PriorityQueue q = new PriorityQueue(5);
        q.deQueue();
        q.enQueue(3);
        q.display();
        q.enQueue(5);
        q.enQueue(1);
        q.enQueue(6);
        q.display();
        q.enQueue(2);
        q.enQueue(4);
        // new block?
        q.display();
        q.deQueue();
        q.display();
    }
}