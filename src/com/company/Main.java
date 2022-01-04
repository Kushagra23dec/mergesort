package com.company;

import java.util.Scanner;

public class Main {

    public void merge (int arr[],int l, int m, int r, int size){
        int i = l;
        int j = m+1;
        int k = l;
        int temp[] = new int[size];

        while(i <=m && j<=r){
            if (arr[i] <= arr[j]){
                temp[k] = arr[i];
                i++;
                k++;
            }

            else{
                temp[k] = arr[j];
                j++;
                k++;
            }
        }

        while(i<=m){
            temp[k] = arr[i];
            i++;
            k++;
        }


        while(j<=r){
            temp[k] = arr[j];
            j++;
            k++;
        }

    for (int p = l; p<=r;p++){
        arr[p] = temp[p];
    }



    }


public void mergeSort(int arr[], int l, int r, int size){

        if(l<r){
            int m = (l+r)/2;
            mergeSort(arr,l,m,size);
            mergeSort(arr, m+1,r,size);
            merge(arr,l,m,r,size);
        }
}




    public static void main(String[] args) {


Main m = new Main();


Scanner s = new Scanner(System.in);
System.out.print("Enter Size: ");
int size = s.nextInt();

int myarray[] = new int[size];

for (int i = 0;i<size;i++){
    myarray[i] = s.nextInt();
}
System.out.println("before Sorting");

        for (int i = 0;i<size;i++){
            System.out.print(" "+myarray[i]);
        }
        System.out.println();

       m.mergeSort(myarray,0, (size-1),size);

        System.out.println("After Sorting");

        for (int i = 0;i<size;i++){
System.out.print(" "+myarray[i]);
}



    }
}
