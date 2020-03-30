/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:15 PM
 */
package problem3.myqueue;

public class MyPriorityQueue {
    private Node rear;
    private Node front;
    private int size;

    // constructor
    public MyQueue() {
        front = null;
        rear = null;
        size = 0;
    }

    public boolean isEmpty() {
        boolean response = false;
        if (size == 0) {
            response = true;
        }
        return response;
    }
    public void enqueue(int element) {
        Node node = new Node(element);
        if (front == null) {
            rear = node;
            front = node;
            size++;
        } else {
            rear.setNext(node);
            rear = node;
            size++;
        }
    }
    public Node dequeue() {
        Node response = null;
        if (front != null) {
            if (front.getNext() != null) {
                response = new Node(front.getData());
                front = front.getNext();
                size--;
            } else {
                response = new Node(front.getData());
                front = null;
                rear = null;
                size--;
            }
        }
        return response;
    }
    public Node peek() {
        Node response = null;
        if (!isEmpty()) {
            response = new Node(front.getData());
        }
        return response;
    }

    // a method to get size of queue
    public int getSize() {
        return size;
    }
}
