package book.crazy_java.data_struture.linear_list;

public class SequenceList<T> {

    private int capacity;
    private int DEFAULT_SIZE = 16;
    private int size = 0;
    private Object[] elementData;

    public SequenceList() {
        capacity = DEFAULT_SIZE;
        elementData = new Object[capacity];
    }

    public SequenceList(T element) {
        this();
        elementData[0] = element;
        size++;
    }

    public SequenceList(T element, int initSize) {
        capacity = 1;
        while (capacity < initSize) {
            capacity <<= 1;
        }
        elementData = new Object[capacity];
        elementData[0] = element;
        size++;
    }

    public int length() {
        return size;
    }

    // 通过索引获取元素
    public T get(int index) {
        if (index > size - 1 || index < 0) {
            throw new IndexOutOfBoundsException("线性表索引越界");
        }
        return (T) elementData[index];
    }

    // 查找线性表中指定元素的索引

    // 向线性表的指定位置插入元素

    //

}
