package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.stream.Collectors;

public class B {
    public static void main(String[] args) {
        //System.out.println("Hi".length());

/*        String name = "Ivan";
        String s = String.format("Name - %s hi hi age %d !!! ", name , 22);
        System.out.println(s);*/

/*        System.out.println(new Random()
                .ints('a', 'z')
                .limit(63)
                .mapToObj(h -> "" + (char) h)
                //.forEacch(System.out::println);
                .collect(Collectors.joining()));*/

/*        int a = 50;
        int b = 99;
        //short c= (short) (a+b);
        byte c = (byte) (a + b); // явное приведение к неправильному типу
        System.out.println("c = " + c);*/

/*        int a = 50;
        System.out.println(a > 50 ? "yes" : "no"); //тернальный оператор*/

/*        int a = 50;
        if (a > 50) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }*/

/*        int age = 4;
        if (age > 3 && age < 7){
            System.out.println("kindergarten");}
            else if (age > 6 && age < 13){
                System.out.println("school");}
                else if (age > 12 && age < 23){
                    System.out.println("university");}
                                    else if (age > 22 && age < 66){
                        System.out.println("retirement");}
                                        else{
                            System.out.println("You are under 4 or older than 65");}*/
/*        int a = 4;
        switch (a) {
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
            default:
                System.out.println("default");
        }*/

/*        String day = "Sunday";
        switch (day) {
            case "Monday":
                System.out.println("work day");
                break;
            case "Sunday":
                System.out.println("off day");
                break;
            default:
                System.out.println("it's unknown day");
        }*/
/*        int i = 0;
        while (i <=100) {
            System.out.println(i);
            i++;
        }
        System.out.println(i);*/

/*      int i = 100;
        do {
            System.out.println();
        } while (i < 100);*/

/*        for (int i = 0; i < 100; i++) {
            System.out.println(i);
        }*/

/*        for (int i = 0; i < 100; i++) {
            if (i%2==0) {
                System.out.println(i);
            }
        }*/
//rework
/*        int i = 0;
        while (i < 100) {
            if (i % 2 == 0) {
                System.out.println(i);
                i++;
            }
        }*/

/*        int [] a = {1,2,3,4,5};
        int [] b = new int [5];
        for (int i : a){
            System.out.println("i = " + i);
        }*/

        /*int[] a = {1, 2, 3, 4, 5};
        int [] b = new int [5];
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));*/

        //System.out.println(Arrays.toString(args));

/*        int[] a = {1, 2, 3, 4, 5, 6};
        int[][] c = {{1, 2, 3},
                { 4, 5, 6}};
        int[] b = new int[5];
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        for (int i : a) {
            System.out.println(i);
        }
        System.out.println(c[1][2]);*/


/*        for (int i = 0; i <10 ; i++) {
            if (i%2 == 0) continue;
                System.out.println("i = " + i);
        }*/

/*        String strInt = "123";
        String strDouble = "123.456";
        int x; double y;
        x = Integer.parseInt(strInt);
        y = Double.parseDouble(strDouble);
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        strInt = String.valueOf(x + 1);
        strDouble = String.valueOf(y + 1);
        System.out.println("strInt = " + strInt);
        System.out.println("strDouble = " + strDouble);
        String str;
        str = "num=" + 345;
        System.out.println(str);*/


        /*int arr[] = {1, 2, 3, 4, 5};
        int arr1[] = {5, 6, 7, 8, 9};

        reverseArr(arr1);
        reverseArr(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr1));

    }

    private static void reverseArr(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length -1 -i];
            arr[arr.length -1 -i]=temp;
        }*/

        /*
        //buble-sort
        int[] data = {7, 9, 0, 7, 6};
        bubleSort(data);
        System.out.println(Arrays.toString(data));
    }

    private static void bubleSort(int[] data) {
        for (int barrier = data.length -1; barrier >= 0; barrier--) {
            for (int index = 0; index < barrier; index++) {
                if (data[index] > data[index+1]){
                    int temp =  data[index];
                    data[index] = data[index + 1];
                    data[index+1]=temp;
                }
            }
        }*/
    }
}
