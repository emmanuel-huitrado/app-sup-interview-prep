package coe.unosquare.processor;

import coe.unosquare.user.User;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public final class DataProcessing {
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
                    userStringInfo[0],
                    userStringInfo[1],
                    userStringInfo[2],
                    Optional.of(userStringInfo[3])));
        });
    }

    public List<User> getUserList(){
        return userList;
    }
}
