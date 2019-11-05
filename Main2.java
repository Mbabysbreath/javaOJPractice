package nowCode;

import java.util.Arrays;

/**寻找数组第K大数：快排
 * @author ZhaoMin
 * @date 2019/11/5 20:49
 */
public class Main2 {
    public void quickSorts(int[] array){
        int left=0;
        int right=array.length-1;
        quickSortInternal(array,left,right);
    }
    public void quickSortInternal(int[] array,int left,int right){
        if(left>=right){
            return;
        }
        int pivotIndex=partition(array,left,right);
        quickSortInternal(array,left,pivotIndex-1);
        quickSortInternal(array,pivotIndex+1,right);
    }
    public int partition(int[] array,int left,int right){
        int pivot=array[right];
        int less=left;
        int great=right;
        while(less<great){
            while(less<great&&array[less]<=pivot){
                less++;
            }
            array[great]=array[less];
            while(less<great&&array[great]>=pivot){
                great--;
            }
            array[less]=array[great];
        }
        array[less]=pivot;
        return less;
    }
    public int findKth(int[] a, int n, int K) {
        // write code here
        quickSorts(a);
        System.out.println(Arrays.toString(a));
        int i;
        int count=0;
        for( i=n-1;i-1>=0;){
           while(a[i]==a[i-1]){
               i--;
           }
           i--;
           count++;
           if(count==K){
              break;
           }
        }
        return a[i+1];
    }

    public static void main(String[] args) {
        int[] arr={1,8,2,2,4,1,5,2,2};
        Main2 ob=new Main2();
        System.out.println(ob.findKth(arr,9,3));
    }
}
