package org.example;

import java.util.*;

public class DisappearedNumberInArray{
  public static void main(String args[]){

    int[] array = {3, 2, 1, 3, 4, 2, 6, 8};
    disappearedNumbers(array);

  }

  static Integer[] disappearedNumbers(int[] array){

    int start = 0;
    while(start < array.length){
      int correctNumber = array[start] - 1;
      System.out.println(correctNumber);
      if(start != array[start] && array[correctNumber] != correctNumber){
        swapNumbers(array, start, array[start]);
      }else{
        start++;
      }
    }

    List<Integer> arrayList = new ArrayList<Integer>();

    for (int i = 0;i <= array.length ; i++ ) {
      if(array[i] + 1 != i){
        arrayList.add(array[i]);
      }

    }

    return arrayList.toArray(new Integer[arrayList.size()]);
  }

  static void swapNumbers(int[] arr, int firstNumber, int secondNumber){
    int temp = arr[firstNumber];
    arr[firstNumber] = arr[secondNumber];
    arr[secondNumber] = temp;
  }
}
