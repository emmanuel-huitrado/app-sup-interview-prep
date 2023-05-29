package coe.unosquare.processor;

import java.util.ArrayList;
import java.util.List;

public final class DataList {
    private static DataList dataList;
    private List<String> userData;
    private DataList(){
        userData = new ArrayList<>();
        generate();
    }
    private void generate(){
        userData.add("1,Potter,Harry,94726.89");
        userData.add("2,Weasly,Ron,6663.23");
        userData.add("3,Granger,Hermione,20662.72");
        userData.add("4,Potter,Harry,20490.68");
        userData.add("5,Granger,Hermione,68686.62");
        userData.add("6,Potter,Harry,62995.47");
        userData.add("7,Granger,Hermione,74355.68");
        userData.add("8,Weasly,Ron,89638.96");
        userData.add("9,Weasly,Fred,100000.00");
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
