package person.lhh.test.lineartable.stack;

public class OrderStack {
    private Integer[] stackRight;
    private Integer[] stackLeft;
    private int length;
    private int left;  // 左栈边界
    private int right; // 右栈边界
    public OrderStack(int length){
        if (length==0)
            throw new RuntimeException();
        if (length%2==0){
            stackRight =new Integer[length/2];
            stackLeft =new Integer[length/2];
        }else {
            stackLeft =new Integer[length/2];
            stackRight =new Integer[length/2+1];
        }
        left =0;
        right=length-1;
        this.length=length;
    }
    public OrderStack(){
        stackRight = new Integer[5];
        stackLeft = new Integer[5];
        left =0;
        right=length-1;
        this.length=10;
    }

    public boolean addStackLeft(Integer a){
        if(left!=right){
            if(left<5){
                stackLeft[left]=a;
                System.out.println(left);
            }else{
                stackRight[length-2-left]=a;
            }
            left++;
            return true;
        }else{
            return false;
        }
    }

    public boolean addStackRight(Integer a){
        if(left!=right){
            if(right<5){
                stackLeft[right]=a;

            }else{
                stackRight[length-1-right]=a;
            }
            right--;
            return true;
        }else{
            return false;
        }
    }

    public Integer popStackRight(){
        int b;
        if(right<5){
           b= stackLeft[right];
            stackLeft[right]=null;

        }else{
            b=stackRight[right-5];
            stackRight[right-5]=null;
        }
        right++;
        return b;
    }

    public Integer popStackLeft(){
        int b;
        if(left<5){
            left--;
            b = stackLeft[left];
            stackLeft[left] = null;

        }else{
            left--;
            b=stackRight[length-1-left];
            stackRight[length-1-left]=null;
        }
        return b;

    }


    public int getLength() {
        return length;
    }
}
