package person.lhh.test.lineartable.linklist.beanhandle;

import org.junit.Test;
import person.lhh.test.lineartable.array.ArrayTest;
import person.lhh.test.lineartable.linklist.bean.Point;

public class PointList {
    int listLength;
    private Point connectPoint(int length){
        listLength =length;
        Point pointHead =new Point();
        Point poingConnectFirst= pointHead;
        for (int i=0;i<length-1;i++){
            Point point =new Point();
            poingConnectFirst.setNext(point);
            point.setPrior(poingConnectFirst);
            poingConnectFirst=point;
        }
        poingConnectFirst.setNext(pointHead);
        pointHead.setPrior(poingConnectFirst);
        return pointHead;
    }

    public Point sort(Point pointHead){
        int[] a =new int[listLength];
        Point point=pointHead;
        for(int i=0;i<listLength;i++){
            a[i] = point.getData();
            point=point.getNext();
        }
        point=pointHead;
        a=ArrayTest.merge_sort(a,0,listLength-1);
        for(int i=0;i<listLength;i++){
            point.setData(a[i]);
            point=point.getNext();
        }
        return pointHead;
    }

    @Test
    public void  test(){
        Point head=connectPoint(5);
        Point point =head;
        for (int i=0;i<5;i++) {
            point.setData(i-3);
            point=point.getNext();
        }
        point=sort(head);
        for (int i=0;i<5;i++) {
           System.out.println( point.getData());
            point=point.getNext();
        }
    }



//    @Test
//    public void test(){
//        Point head=connectPoint(5);
//        Point point =head;
//        for (int i=0;i<5;i++) {
//
//            point.setData(i);
//            point=point.getNext();
//        }
//        point =head;
//        for (int i=0;i<6;i++) {
//           System.out.println( point.getData());
//            point=point.getNext();
//        }
//    }

}
