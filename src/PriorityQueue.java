// new file create
public class PriorityQueue {
    private int[] items;
    private final int SIZE;
    int front, rear;

    // new block
    PriorityQueue(int size) {
        front = rear = -1;
        SIZE = size;
        items = new int[SIZE];
    }

    // new block
    public void priority() {
        int i;
        int j;
        int l;
        for (i = 1; i < rear; i++) {
            for (j = rear; j >= i; j--)
                if (items[j - 1] > items[j]) {
                    l = items[j - 1];
                    items[j - 1] = items[j];
                    items[j] = l;
                }
        }
    }

    // new block
    private boolean isFull() {
        if (front == 0 && rear == SIZE - 1)
            return true;
        else return false;
    }

    // new block
    private boolean isEmpty() {
        if (front == -1)
            return true;
        else return false;
    }

    // new block
    public void enQueue(int element) {
        if (isFull()) {
            System.out.println("Очередь заполнена");
        } else {
            if (isEmpty())
                front = 0;
            rear++;
            items[rear] = element;
            priority();
            System.out.println("Добавлен объект " + element);
        }
    }

    // new block
    public int deQueue() {
        int element;
        if (isEmpty()) {
            System.out.println("Очередь пуста");
            return -1;
        } else {
            element = items[front];
            if (front >= rear) {
                front = -1;
                rear = -1;
            } else {
                front++;
            }
        }
        System.out.println("Удалён объект " + element);
        return element;
    }

    // new block
    void display() {
        int i;
        if (isEmpty()) {
            System.out.println("Пустая очередь");
        } else {
            System.out.println("Индексы FRONT и REAR: " + front + " " + rear);
            System.out.println("Элементы очереди: ");
            for (i = front; i <= rear; i++) {
                System.out.println(items[i] + " ");
            }
            System.out.println();
        }
    }
        // new block
        public int size () {
            return (rear - front) + 1;
        }
        // final in this file
    }
