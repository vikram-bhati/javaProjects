package SortArray;

import java.util.Scanner;

public class SortArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number Of Elements=");
        int num = sc.nextInt();
        int[] myArray = new int[num];
        myArray=getInt(num);
        printArray(myArray);
        sortArray(myArray);
    }
        public static int[] getInt(int num){
            Scanner sc = new Scanner(System.in);
            int[] array=new int[num];
            System.out.println("***************\nEnter the Values in the array\n");
        for(int i=0;i<array.length;i++){
            System.out.println("Enter the Value at index "+i+"=");
            array[i]=sc.nextInt();
         }
         return array;

        }
        public static void printArray(int[] array){
        for (int j=0;j<array.length;j++){
            System.out.println("Value at index="+j+" is="+array[j]);
        }
        }

        public static void sortArray(int[] array){
        for (int k=0;k<array.length;k++){
            for (int l=0;l<array.length;l++) {
                if (array[k]<array[l]){
                    int temp=array[k];
                    array[k]=array[l];
                    array[l]=temp;
                    sortArray(array);
                }
                else {break;}

                }
            }
            System.out.println("Sorted array is");;
            printArray(array);
    }


}












