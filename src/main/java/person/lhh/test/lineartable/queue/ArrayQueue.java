package person.lhh.test.lineartable.queue;


import java.util.List;

public class ArrayQueue<T> {
    private int Rear; // 队尾元素的位置
    private int Len; // 内含元素的个数
    private int capacity;// queue最大空间
    private T[] sequ;

    public ArrayQueue() throws Exception {
        sequ =(T[])new Object[10];
        this.capacity=10;
    }

    public ArrayQueue(int MaxSize){
        sequ =(T[])new Object[MaxSize];
        this.capacity=MaxSize;
    }

    public Boolean add(){
        if(Len>=capacity) {
            return false;
        }
        Len++;

        return true;
    }
}
