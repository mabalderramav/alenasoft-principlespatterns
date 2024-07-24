package edu.alenasoft.principlespatterns.patterns.iterator;

import java.util.ArrayList;
import java.util.List;

public class CreApiClient {
    public List<CreUser> getCreUsers() {
        List<CreUser> creUsers = new ArrayList<>(4);
        creUsers.add(new CreUser("CREOne", "creone@gmail.com"));
        creUsers.add(new CreUser("CRETwo", "cretwo@gmail.com"));
        creUsers.add(new CreUser("CREThree", "crethree@gmail.com"));
        creUsers.add(new CreUser("CREFour", "crefourone@gmail.com"));

        return creUsers;
    }
}
