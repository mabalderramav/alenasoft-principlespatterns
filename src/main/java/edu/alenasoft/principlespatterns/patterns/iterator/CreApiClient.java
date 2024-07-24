package edu.alenasoft.principlespatterns.patterns.iterator;

import java.util.HashMap;
import java.util.Map;

public class CreApiClient {
    public Map<Integer ,UserData> getCreUsers() {
        Map<Integer ,UserData> creUsers = new HashMap<>();
        creUsers.put(1,new UserData("CREOne", "test1 address", 1000.0));
        creUsers.put(2,new UserData("CRETwo", "test2 address", 2000.0));
        creUsers.put(3,new UserData("CREThree", "test3 address", 3000.0));
        creUsers.put(4,new UserData("CREFour", "test4 address", 4000.0));

        return creUsers;
    }
}
