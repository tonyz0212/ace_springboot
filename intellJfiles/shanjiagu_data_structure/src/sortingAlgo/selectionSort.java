package sortingAlgo;


import java.util.Arrays;

/*
    基本思想：
            第一次从arr[0] 到 arr[n-1] 中选取最小值，与arr[0]交换， 第二次从 arr[1] 到 arr[n-1] 中选取最小值，与arr[1]交换
            第i次从 arr[i-1] 到 arr[n-1] 中选取最小值，与arr[i-1]交换
            以此类推

 */
public class selectionSort{

    public static void selectSort(int [] arr) {


        int len = arr.length;
        for(int i = 0 ; i < len ; i++){
            int min = Integer.MAX_VALUE;
            int minIndex=i;
            // find minimum value
            for(int j = i; j < len ; j++){
                if( arr[j] < min){
                    minIndex = j;
                    min = arr[j];
                }
            }
            // 找到最小值后，把最小值和 position i 交换
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }

    public static void main(String [] args) {

        int [] arr = { 1,3,5,2,4,-1,-2,-3};
        selectSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
