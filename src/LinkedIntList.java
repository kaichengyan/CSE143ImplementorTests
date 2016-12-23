import java.util.*;

public class LinkedIntList {

    private ListNode front;

    public LinkedIntList() {
    }

    public LinkedIntList(List<Integer> l) {
        if (!l.isEmpty()) {
            this.front = new ListNode(l.get(0));
            ListNode t = this.front;
            for (int i = 1; i < l.size(); i++) {
                t.next = new ListNode(l.get(i));
                t = t.next;
            }
        }
    }

    @Override
    public String toString() {
        if (this.front == null) {
            return "empty";
        }
        String result = "";
        ListNode t = this.front;
        while (t != null) {
            result += "[ " + t.data + " ] -> ";
            t = t.next;
        }
        result += "null";
        return result;
    }

    private static class ListNode {
        public final int data;
        public ListNode next;

        public ListNode(int data) {
            this(data, null);
        }

        public ListNode(int data, ListNode next) {
            this.data = data;
            this.next = next;
        }

    }

    // Your method here.
}
