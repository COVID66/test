package person.lhh.test.lineartable.stack;

import org.junit.Test;

public class StackTest {
    OrderStack orderStack =new OrderStack();

    @Test
    public void test(){
        for(int i=0;i<6;i++) {
            orderStack.addStackLeft(i);
        }
        System.out.println("hh");
        for (int i=6;i>0;i--){

            System.out.println(orderStack.popStackLeft());
        }
    }
}
