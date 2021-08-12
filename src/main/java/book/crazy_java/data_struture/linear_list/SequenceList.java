package book.crazy_java.data_struture.linear_list;

import java.util.Arrays;

/* 顺序线性表的特点
 * 1.访问每个元素速度都一样
 * 2.插入时,需要注意数组容量是否已满
 * */

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
    public int indexOf(T element) {
        if (element == null) {
            return -1;
        }
        for (int i = 0; i < elementData.length - 1; i++) {
            if (element.equals(elementData[i])) {
                return i;
            }
        }
        return -1;
    }

    public void ensureCapacity(int minCapacity) {
        if (capacity < minCapacity) {
            while (capacity < minCapacity) {
                capacity <<= 1;
            }
            elementData = Arrays.copyOf(elementData, capacity);
        }
    }

    // 向线性表的指定位置插入元素
    public void insert(T element, int index) {
        ensureCapacity(index);
        ensureCapacity(size + 1);
        System.arraycopy(elementData, index, elementData, index + 1, size - index);
        elementData[index] = element;
        size++;
    }

    // 添加元素
    public void add(T element) {
        insert(element, size);
    }

    // 删除指定索引处的元素
    public T delete(int index) {
        ensureIndex(index);
        T oldElt = (T) elementData[index];
        int moveNum = size - (index + 1);
        if (moveNum > 0) {
            System.arraycopy(elementData, index + 1, elementData, index, moveNum);
        }
        elementData[--size] = null;
        return oldElt;
    }

    public void ensureIndex(int index) {
        if (index > size - 1 || index < 0) {
            throw new IndexOutOfBoundsException("线性表索引越界");
        }
    }

    // 删除最后一个元素
    public T remove() {
        return delete(size - 1);
    }

    // 判断是否为空
    public boolean isEmpty() {
        return size == 0;
    }

    // 清空
    public void clear() {
        Arrays.fill(elementData, null);
        size = 0;
    }

    public String toString() {
        if (elementData == null) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < size - 1; i++) {
            sb.append(elementData[i].toString()).append(",");
        }
        sb.append(elementData[size - 1].toString()).append("]");
        return sb.toString();
    }

    public static void main(String[] args) {
        SequenceList<String> list = new SequenceList<>();
        list.add("我");
        list.add("是");
        list.add("水");
        list.add("瓶");
        list.add("座");
        list.delete(3);
        System.out.println(list.toString());
    }

}
