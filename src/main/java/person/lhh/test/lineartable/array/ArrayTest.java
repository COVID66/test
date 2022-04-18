package person.lhh.test.lineartable.array;

public  class ArrayTest {
    //a 数组  l左边界  r右边界
    public static int[] merge_sort(int[] a ,int l,int r) {
        if(l>=r)
            return null;
        int mid=(l+r)/2; //重点

        merge_sort(a,l,mid);
        merge_sort(a,mid+1,r);
        merge(a,l,r,mid);

        return a;
    }

    private static void  merge(int a[],int l,int r,int mid)
    {
        int[] b = new int[r-l+1];
        int i;
        int j;
        int k;

        for(k=l;k<=r;k++)
            b[k-l]=a[k];

        i=l;
        j=mid+1;
        for(k=l;k<=r;k++)
        {
            if(i>mid)
            {
                a[k]=b[j-l];
                j++;
            }
            else if(j>r)
            {
                a[k]=b[i-l];
                i++;
            }
            else if(b[i-l]>b[j-l])
            {
                a[k]=b[j-l];
                j++;
            }
            else
            {
                a[k]=b[i-l];
                i++;
            }

        }

    }
}
