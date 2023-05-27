package coe.unosquare.processor;

import coe.unosquare.user.User;
import java.util.ArrayList;
import java.util.List;

public class DataProcessing {
    private final DataList dataList;
    private List<User> userList;

    public DataProcessing(DataList dataList){
        this.dataList = dataList;
        processData();
    }

    private void processData(){
        userList = new ArrayList<>();
        dataList.getGeneratedInfo().forEach(userInfo->{
            String[] userStringInfo = userInfo.split(",");
            userList.add(new User(
                    Integer.parseInt(userStringInfo[0]),
                    userStringInfo[1],
                    userStringInfo[2],
                    Double.parseDouble(userStringInfo[3])));
        });
    }

    public List<User> getUserList(){
        return userList;
    }

    public void insertUser(User user){
        userList.add(user);
    }
}
