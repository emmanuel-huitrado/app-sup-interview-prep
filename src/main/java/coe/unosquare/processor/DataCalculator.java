package coe.unosquare.processor;

import coe.unosquare.user.User;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public final class DataCalculator {

    private DataCalculator(){}
    public static Map<String, String> calculateTotalSavings(List<User> processedUserList){
        Map<String, String> totalSavingsByUser = new HashMap<>();
        Map<String, Map<String, List<User>>> savingsByFirstAndLastName = processedUserList.stream()
                .collect(Collectors.groupingBy(User::getFirstName, Collectors.groupingBy(User::getLastName)));
        savingsByFirstAndLastName.keySet()
                .forEach(firstname -> savingsByFirstAndLastName.get(firstname)
                        .keySet()
                        .forEach(lastname ->
                                totalSavingsByUser.put(firstname + " " + lastname,
                                        savingsByFirstAndLastName.get(firstname).get(lastname)
                                                .stream()
                                                .map(user -> user.getSavings().get())
                                                .reduce("0",(subtotal, savings) -> subtotal + savings))));
        return  totalSavingsByUser;
    }

    public static void print(Map<String,  String> savingsByUser){
        savingsByUser.forEach((name, amount) ->
                System.out.println(name + ": " + amount));
    }
}
