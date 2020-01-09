package alwrite;
/*
 * @author Xingqilin
 *
 */

import java.util.Arrays;
import java.util.LinkedList;

public class MyAlAchieve {
    /**
     * 懒构造
     * final属性，默认长度，空object数组,Object元素数组
     * 私有属性，元素个数size
     * 方法：
     * 有长度，无长度构造
     * 添加，位置添加，触发扩容机制
     * 修改
     * 下标删除，条件删除
     * 查找 constant
     * size（）
     * 清空clear（）
     * 下标判断方法
     * 容量判断方法
     * 扩容方法
     */
    private int size = 0;
    private static final Object[] DEFAULT_ELEMENTDATA = {};
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] elementmy;

    MyAlAchieve() {
        elementmy = DEFAULT_ELEMENTDATA;
    }

    MyAlAchieve(int i) {
        if (i > 0) {
            elementmy = new Object[i];
        } else {
            elementmy = DEFAULT_ELEMENTDATA;
            System.err.println("长度异常，自动建立空链表");
        }
    }

    //尾添加
    public void addele(Object ob) {
        if (ensureCapacity(size + 1)) {
            elementmy[size++] = ob;
            return;
        }
        extendCapacity();
        elementmy[size++] = ob;
    }

    //下标添加
    public void addele(int index, Object ob) {
        if (checkLegal(index)) {
            if (ensureCapacity(size + 1)) {
                System.arraycopy(elementmy, index, elementmy, index + 1, size - index);
                elementmy[index] = ob;
            } else {
                Object[] obn = new Object[(int) (elementmy.length * 1.5)];
                System.arraycopy(elementmy, 0, obn, 0, index - 1);
                size++;
                elementmy[index] = ob;
                System.arraycopy(elementmy, index, obn, index + 1, size - index);
                elementmy = obn;
            }
        }

    }

    //修改
    public void setAl(int index, Object ob) {
        checkLegals(index);
        elementmy[index - 1] = ob;

    }

    //下标删除
    public void remove(int index) {
        setAl(index, null);
    }

    //条件删除//lambda泛型编程
    public void removeif() {

    }

    //查找indexOf()
    public int indexOf(Object ob) {
        if (ob == null) {
            for (int i = 0; i < elementmy.length; i++) {
                if (elementmy[i] == null)
                    return i;
            }
        } else {
            for (int i = 0; i < elementmy.length; i++) {
                if (ob.equals(elementmy[i]))
                    return i;
            }
        }
        return -1;
    }

    //获得size（）
    public int getSize() {
        return size;
    }

    //clean（）
    public void clean() {
        for (int i = 0; i < elementmy.length; i++) {
            elementmy[i] = null;
        }
        size = 0;
    }

    //add下标合法验证
    private boolean checkLegal(int index) {
        if (size == 0 && index != 0) return false;
        return (-1 < index && index < size + 2);

    }

    //set下标合法验证
    private void checkLegals(int index) {
        if (index >= size)
            throw new ArrayIndexOutOfBoundsException("输入下标越界了");

    }

    //容量判断
    private boolean ensureCapacity(int i) {
        return i < elementmy.length;
    }

    //扩容方法
    private void extendCapacity() {
        if (size == 0) {
            elementmy = new Object[DEFAULT_CAPACITY];
        } else {
            elementmy = Arrays.copyOf(elementmy, (int) (elementmy.length * 1.5));
        }
    }

}
