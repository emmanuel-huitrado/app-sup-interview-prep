package coe.unosquare;

import coe.unosquare.processor.DataList;
import coe.unosquare.processor.DataProcessing;
import coe.unosquare.user.User;

public class Main {
    public static void main(String[] args) {
        DataProcessing processor = new DataProcessing(DataList.getInstance());
        processor.getUserList().forEach(user -> System.out.println(user.toString()));
        processor.insertUser(new User(9,"Malfoy","Drako",10746328.07));
        processor.getUserList().forEach(user -> System.out.println(user.toString()));
    }
}
