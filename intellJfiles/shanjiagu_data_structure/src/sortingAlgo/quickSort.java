package sortingAlgo;

 /*
   quick sort 思想：
   pivot可随机找，
   1.找array最左边的来当我们的pivot
   2. 当 l != r 时
      - 从最右边开始找比pivot小的 element
      - 从最左边开始找比pivot大的 element
      当上面两个都找到了，我们把它们两个的位置换过来
   3. 跑完整个while循环后， 我们把 pivot和 i，j 等于对方的这个点交换位置
   4. 这个pivot point的排序完成，我们进行对 pivot 左边和右边进行 qsort
  */

import java.util.Arrays;

public class quickSort {

    public static  void qsort( int [] arr, int left, int right){

        if( left >  right){
            return;
        }
        int l = left;
        int r = right;

        // 我们的pivot会是最左数
        int pivot = arr[left];


        while( l != r) {

            // 从右边开始,找比pivot小的
            while (l != r && arr[r] >= pivot) {
                r--;
            }

            // 从左边开始,找比pivot大的
            while (l != r && arr[l] <= pivot) {
                l++;
            }
            // 上面的两个while都找到了
            if (l < r) {
                int temp = arr[l];
                arr[l] = arr[r];
                arr[r] = temp;
            }
        }
        // 将pivot 和 i，j相碰的index 交换

        arr[left] = arr[l];
        arr[l] = pivot;

        qsort(arr,left,r-1);
        qsort(arr,r+1,right);
    }

    public static void main(String[] args) {
        int [] arr = {-9,78,0,23,-67,70};
        System.out.println(Arrays.toString(arr));
        qsort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
