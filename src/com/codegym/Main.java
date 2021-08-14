package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size: ");
        int size = sc.nextInt();
	    int[] arr = new int[size];
	    int index = minValue(arr);
        int i = 0;
        while (i < arr.length) {
            System.out.print("Enter element" + (i + 1) + " : ");
            arr[i] = sc.nextInt();
            i++;
        }
        System.out.println("Min: " + arr[index]);
    }
    public static int minValue(int [] array){
        int index = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] < array[index]){
                index = i;
            }
        }
        return index;
    }
}
