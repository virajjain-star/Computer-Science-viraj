import java.util.Scanner;

public class daksheshsmb {


    static int[] stack = new int[5];
    static int top = -1;

    public static void push() {
        Scanner scanner = new Scanner(System.in);
        if (top == stack.length - 1) {
            System.out.println("Stack Overflow");
        } else {
            System.out.print("Enter number: ");
            stack[++top] = scanner.nextInt();
        }
    }

    public static void pop() {
        if (top == -1) {
            System.out.println("Stack Underflow!");
        } else {
            System.out.println("Popped: " + stack[top--]);
        }
    }

    static int[] queue = new int[5];
    static int front = 0, rear = -1, size = 0;

    public static void enqueue() {
        Scanner scanner = new Scanner(System.in);
        if (size == queue.length) {
            System.out.println("Queue Full");
        } else {
            System.out.print("Enter number: ");
            rear = (rear + 1) % queue.length;
            queue[rear] = scanner.nextInt();
            size++;
        }
    }

    public static void dequeue() {
        if (size == 0) {
            System.out.println("Queue Empty");
        } else {
            System.out.println("Dequeued: " + queue[front]);
            front = (front + 1) % queue.length;
            size--;
        }
    }


    public static void showStack() {
        if (top == -1) System.out.println("Stack empty");
        else {
            System.out.print("Stack: ");
            for (int i = 0; i <= top; i++) System.out.print(stack[i] + " ");
            System.out.println();
        }
    }


    public static void showQueue() {
        if (size == 0) System.out.println("Queue empty");
        else {
            System.out.print("Queue: ");
            for (int i = 0; i < size; i++) {
                System.out.print(queue[(front + i) % queue.length] + " ");
            }
            System.out.println();
        }
    }
}


