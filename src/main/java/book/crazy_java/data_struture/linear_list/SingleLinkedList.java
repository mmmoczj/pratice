package book.crazy_java.data_struture.linear_list;

/*特点
 * 1.需要在每一个元素中存放下一个元素的引用
 * 2.插入比较快
 * 3.查找比较慢
 * 4.不许预先设置长度
 * 5.开销大
 * */
public class SingleLinkedList<T> {

    private class Node {

        private T data;
        private Node next;

        public Node() {
        }

        public Node(T data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    private Node header;
    private Node tailer;
    private int size;

    public SingleLinkedList() {
        header = null;
        tailer = null;
        size = 0;
    }

    public SingleLinkedList(T a, T b, T c) {
        Node node3 = new Node(c, null);
        Node node2 = new Node(b, node3);
        Node node1 = new Node(a, node2);
        header = node1;
        tailer = node3;
        size = 3;
    }

    public SingleLinkedList(T element) {
        header = new Node(element, null);
        tailer = header;
        size++;
    }

    public int length() {
        return size;
    }

    public T get(int index) {
        Node result = getNodeByIndex(index);
        if (result == null) {
            return null;
        }
        return result.data;
    }

    private void ensureIndexRange(int index) {
        if (index < 0 || index > size - 1) {
            throw new IndexOutOfBoundsException("线性表索引越界");
        }
    }

    private Node getNodeByIndex(int index) {
        ensureIndexRange(index);
        Node current = header;
        for (int i = 0; i < size && current != null;
             i++, current = current.next) {

            if (i == index) {
                return current;
            }
        }
        return null;
    }

    public int indexOf(T element) {
        Node current = header;
        for (int i = 0; i < size && current != null;
             i++, current = current.next) {

            if (current.data.equals(element)) {
                return i;
            }
        }
        return -1;
    }

    public void insert(T element, int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("线性表索引越界");
        }
        if (header == null) {
            add(element);
            return;
        }
        if (index == 0) {
            addAtHeader(element);
        }

    }

    public void add(T element) {
        if (header == null) {
            header = new Node(element, null);
            tailer = header;
        } else {
            tailer.next = new Node(element, null);
            tailer = tailer.next;
        }
        size++;
    }

    public void addAtHeader(T element) {
        header = new Node(element, header);
        if (tailer == null) {
            tailer = header;
        }
        size++;
    }

    public T delete(int index) {
        return null;
    }

    public T remove() {
        return null;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void clear() {
        header = null;
        tailer = null;
        size = 0;
    }

    public String toString() {
        if (header == null) {
            return "";
        }
        Node current = header;
        StringBuilder sb = new StringBuilder("[");
        while (current.next != null) {
            sb.append(current.data.toString()).append(",");
            current = current.next;
        }
        sb.append(current.data.toString());
        sb.append("]");
        return sb.toString();
    }

    public static void main(String[] args) {
        SingleLinkedList<String> list = new SingleLinkedList("a", "b", "c");
        System.out.println(list.toString());
    }
}
