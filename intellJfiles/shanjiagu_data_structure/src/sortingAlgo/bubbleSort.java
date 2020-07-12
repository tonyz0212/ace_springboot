package sortingAlgo;

import java.util.Arrays;
/*
    bubble sort time complexity will be O(n^2)
    最快可能是O(n), 第一个次outer for loop 发现都是按照顺序的话。
    第一个iteration会把最大的值弄到array 最后
    第二个iteration会把倒数第二大的值弄到array的倒数第二的位置

 */
public class bubbleSort {



    // sort the arr in a increasing order
    public static void bubblesort(int [] arr){

        // 使用这个flag来表示 跑完一个outer loop， array里的element都是按顺序的，所以不需要进行接下来的for loop了
        boolean flag = false;

        int n  = arr.length-1;
        for( int i = 0; i < n ; i++){
            for(int j = 0; j < n - i ; j++){

                if( arr[j] > arr[j+1]){
                    flag = true;
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
            //跑个整个array后，发现都是按顺序的，就可以直接break出for loop了
            if(flag == false){
                break;
            }
        }


    }

    public static void main(String [] args){

        int [] arr = {6,5,4,3,2,1};
        bubblesort(arr);
        System.out.println(Arrays.toString(arr));

    }


}



