package com.hillel.dolhunin.homework.homework13;

public class Main {
    public static void main(String[] args) {

        FileNavigator fileNavigator = new FileNavigator();

        FileData fileData1 = new FileData("file1.java", 5, "/path/java/file1");
        FileData fileData2 = new FileData("file2.java", 10, "/path/java/file2");
        FileData fileData3 = new FileData("file3.java", 15, "/path/java/file3");
        FileData fileData4 = new FileData("file4.java", 20, "/path/java/file4");
        FileData fileData5 = new FileData("file5.java", 25, "/path/java/file5");

        fileNavigator.add("/path/java/file1", fileData1);
        fileNavigator.add("/path/java/file2", fileData2);
        fileNavigator.add("/path/java/file3", fileData3);
        fileNavigator.add("/path/java/file4", fileData4);
        fileNavigator.add("/path/java/file5", fileData5);

        System.out.println(fileNavigator);

        System.out.println(fileNavigator.find("/path/java/file3"));

        System.out.println(fileNavigator.filterBySize(15));

        fileNavigator.remove("/path/java/file3");
        System.out.println(fileNavigator);

        System.out.println(fileNavigator.sortBySize());


    }






}
