public class MinStackImpl implements MinStack<Integer> {

    private static class Node {
        int value;
        int minimum;
        Node next;

        Node(int value, int minimum, Node next) {
            this.value = value;
            this.minimum = minimum;
            this.next = next;
        }
    }

    private Node head;

    @Override
    public void push(Integer value) {
        int minimum = value;

        if (head != null) {
            minimum = Math.min(value, head.minimum);
        }

        head = new Node(value, minimum, head);
    }

    @Override
    public Integer pop() {
        int value = head.value;
        head = head.next;
        return value;
    }

    @Override
    public Integer top() {
        return head.value;
    }

    @Override
    public Integer min() {
        return head.minimum;
    }
}
