package sortingAlgo;

public class mergeSort {

    // 思想： 把array 一半一半的divide到，只剩一个element的array
    //       然后再合并会去

    // merge:

    public static void main(String[] args) {
        int [] arr = {8,4,5,7,1,3,6,2};

    }

    /**
     *
     * @param arr 要sort
     * @param left 左边的array的初始索引
     * @param leftEnd 左边的array的最后一个元素的position
     * @param lastPos array的最后元素
     * @param temp
     */
    public mergeSort( int []arr, int left, int leftEnd, int lastPos, int [] temp){
        int i = left;
        int j = leftEnd+1;
        //指向temp array的指针
        int t = 0;

        /* 1.
         把左右两边的array都加进temp array里
         */
        while ( i <= leftEnd && j <= lastPos){
            if(arr[i] <= arr[j]){
                temp[t]= arr[i];
                t++;
                i++;
            }
            else{
                temp[t] = arr[j];
                t++;
                j++;

            }
        }

        /* 2.
         有一边有剩余的，把剩余的一边再继续加进temp 里。
         */

        // 不确定是左边剩余还是右边，都搞了
        while(i <= leftEnd){
            temp[t]=arr[i];
            i++;
            t++;
        }
        while(j <= lastPos){
            temp[t] = arr[j];
            j++;
            t++;
        }

        /* 3.
           temp 再传回本来的array
         */
    }
}
