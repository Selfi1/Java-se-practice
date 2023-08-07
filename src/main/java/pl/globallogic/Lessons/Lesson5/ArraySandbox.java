package pl.globallogic.Lessons.Lesson5;

import pl.globallogic.Lessons.Lesson3.User;

public class ArraySandbox {
    public static void main(String[] args) {
        // how to create an array
        String name1 ="Joe";
        String name2 ="Jane";
        String name3 ="Ivan";
        String[] names = new String[]{"Joe","Jane","Ivan"};
        User[] users = {new User( name:"Joe"), new User(name:"Jane")}
        int[] evenNumbers = {2,4,6,8};


        //How to access array element
        User joe = users[0];
        //how to loop an array
        //Enchanced for loop
        //How to output array - Arrays, toString(..)
        //How to sort an array
        System.out.println(users[0]);
        System.out.println(users[1]);
        System.out.println(users[2]);
        System.out.println("----------------------------");
        for (int i = 0; 1 < users.length; i++) {
            System.out.println(users[i]);
        }
/*        int i = 0;
        while (i < users.length) {
            System.out.println(users[i]);
            i++;
        }*/
        //How to sort primitive array
        // How to search in array - Arrays, binarySearch(..)
        // How to copy an array/part of array (demo with references to same array)- Arrays.copyOf()
        // How to fill an array with values -Arrays.fill()

    }
}