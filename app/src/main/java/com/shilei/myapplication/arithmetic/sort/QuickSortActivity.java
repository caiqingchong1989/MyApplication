package com.shilei.myapplication.arithmetic.sort;

import java.util.Arrays;

/**
 * My Application
 * 作者：shilei on 2021/1/10 17:26
 * 邮箱：hello_shilei@126.com
 * 类备注：
 */
public class QuickSortActivity {

    public static void quickSort(int[] arr, int l, int r) {
        if(l>=r){
            return;
        }
        int p = partition(arr, l, r);
        quickSort(arr, l, p - 1);
        quickSort(arr, p + 1, r);

    }

    private static int partition(int[] arr, int l, int r) {
        int v = arr[l];
        int j = l;
        // arr[l+1...j] < v ;  arr[j+1...i)>v
        for (int i = l + 1; i <= r; i++) {
            if (arr[i] < v) {
//                swap(arr[i],arr[j+1]);
                int temp = arr[i];
                arr[i] = arr[j + 1];
                arr[j + 1] = temp;
                j++;

            }
        }
//        swap(arr[l],arr[j]);
        int temp = arr[l];
        arr[l] = arr[j];
        arr[j] = temp;
        return j;
    }


    //    对arr[l,r]部分进行快速排序
    //1.对arr[l,r]进行partition操作 返回p
//        使得arr[l...p-1]<arr[p]  arr[p+1...r]>arr[p]
//   2、然后对arr[l,p-1]和 arr[p+1,r]进行递归
    public static void main(String[] args) {
        int[] arr = new int[]{2,3,9,2,5,9,1,8,2};
        quickSort(arr,0,arr.length-1);

        System.out.println(Arrays.toString(arr));
    }

}
