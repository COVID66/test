package person.lhh.test.lineartable.array;

import org.junit.Test;


public class test {
    @Test
    public void test(){
        int[] a ={-20,1,3,6,-75,-20,456,36445};
        int l=0;
        int r=a.length-1;

        int[] b=ArrayTest.merge_sort(a,l,r);
        for (int c:b) {
            System.out.print(c);
        }
    }
}
