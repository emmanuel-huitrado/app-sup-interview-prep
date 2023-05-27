package coe.unosquare.processor;

import java.util.ArrayList;
import java.util.List;

public class DataList {
    private static DataList dataList;
    private List<String> userData;
    private DataList(){
        userData = new ArrayList<>();
        generate();
    }
    private void generate(){
        userData.add("1,Potter,Harry,1894726.89");
        userData.add("2,Weasly,Ron,456663.23");
        userData.add("3,Granger,Hermione,9420662.72");
        userData.add("4,Lovegood,Luna,6220490.68");
        userData.add("5,Lupin,Remus,7468686.62");
        userData.add("6,McGonagall,Minerva,8262995.47");
        userData.add("7,Black,Sirius,6974355.68");
        userData.add("8,Hagrid,Rubeus,2789638.96");
    }

    public void print(){
        userData.forEach(System.out::println);
    }

    public static DataList getInstance(){
        if(dataList == null){
            dataList = new DataList();
        }
        return dataList;
    }

    public List<String> getGeneratedInfo(){
        return userData;
    }
}
