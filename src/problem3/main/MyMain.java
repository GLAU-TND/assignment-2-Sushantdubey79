/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:13 PM
 */
package problem3.main;
// executable class
// use problem5.student.Student class to create object of student
public class MyMain {
    MyQueue queue = new MyQueue();
        queue.enqueue(1000);
        System.out.println(queue.getSize());
        System.out.println(queue.peek().getData() + " element at front");
        queue.enqueue(3000);
        queue.enqueue(600);
        queue.enqueue(200);
        System.out.println(queue.dequeue().getData() + " element deleted from queue");
        System.out.println("the size queue is = " + queue.getSize());

}
