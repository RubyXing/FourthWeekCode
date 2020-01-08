package alwrite;/*
 * @author Xingqilin
 *
 */

public class MyLinked {
    private Link first;
    private int nElem; //链表中节点数量

    public MyLinked() {
        first = null;
        nElem = 0;
    }

    public void insertFirst(int value) {//添加头结点
        Link newLink = new Link(value);
        newLink.next = first; //newLink-->old first
        first = newLink; //first-->newLink
        nElem++;
    }

    public Link deleteFirst() { //删除头结点
        if (isEmpty()) {
            System.out.println("链表为空！");
            return null;
        }
        Link temp = first;
        first = first.next;
        nElem--;
        return temp;
    }

    //插入
    public void insert(int value) {
        Link newLink = new Link(value);
        Link previous = null;
        Link current = first;
        while (current != null && value > current.data) {
            previous = current;
            current = current.next;
        }
        if (previous == null) {
            first = newLink;
        } else {
            previous.next = newLink;
        }
        newLink.next = current;
        nElem++;
    }

    public Link find(int value) { //查找特定的节点
        Link current = first;
        while (current.data != value) {
            if (current.next == null)
                return null;
            else
                current = current.next;
        }
        return current;
    }

    public Link delete(int value) { //删除特定的节点
        Link current = first;
        Link previous = first;
        while (current.data != value) {
            if (current.next == null) {
                return null;
            }
            previous = current;
            current = current.next;
        }
        if (current == first) {
            first = first.next;
        } else {
            previous.next = current.next;
        }
        nElem--;
        return current;
    }

    public void displayList() {
        if (isEmpty()) {
            System.out.println("链表为空！");
            return;
        }
        Link current = first;
        while (current != null) {
            current.displayLink();
            current = current.next;
        }
        System.out.println(" ");
    }

    public boolean isEmpty() {
        return (first == null);
    }

    public int size() {
        return nElem;
    }
}

class Link {
    public int data;
    public Link next;

    public Link(int data) {
        this.data = data;
        this.next = null;
    }

    public void displayLink() {
        System.out.print("{" + data + "} ");
    }
}


