/**
 * This should be a queue
 * Created 2020-02-14
 *
 * @author Magnus Silverdal
 */
public class Queue {
    // Need data structure....
    private int count = 0;
    public Queue() {

    }

    public void enqueue(String text) {
        count++;

    }

    public String dequeue() {
        count--;
        return "Test";


    }

    public boolean isEmpty() {
        return true;
    }

    public int size() {
        return count;

    }
}
