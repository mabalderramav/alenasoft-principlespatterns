package edu.alenasoft.principlespatterns.patterns.iterator;

import java.util.List;
import java.util.Map;

public class CreUserIterator implements Iterator<CreUser> {

    private final Map<Integer ,UserData> creUsers;
    private int currentPosition = 1;

    public CreUserIterator(Map<Integer ,UserData> creUsers) {
        this.creUsers = creUsers;
    }


    @Override
    public CreUser next() {
        return new CreUser(this.currentPosition++, this.creUsers.get(this.currentPosition));
    }

    @Override
    public boolean isDone() {
        return this.currentPosition >= this.creUsers.size();
    }

    @Override
    public CreUser currentItem() {
        return new CreUser(this.currentPosition, this.creUsers.get(this.currentPosition));
    }
}
