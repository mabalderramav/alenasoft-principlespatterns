package edu.alenasoft.principlespatterns.patterns.iterator;

import java.util.List;

public class CreUserIterator implements Iterator<CreUser> {

    private final List<CreUser> creUsers;
    private int currentPosition = 0;

    public CreUserIterator(List<CreUser> creUsers) {
        this.creUsers = creUsers;
    }


    @Override
    public CreUser next() {
        return this.creUsers.get(currentPosition++);
    }

    @Override
    public boolean isDone() {
        return this.currentPosition >= this.creUsers.size();
    }

    @Override
    public CreUser currentItem() {
        return this.creUsers.get(currentPosition);
    }
}
