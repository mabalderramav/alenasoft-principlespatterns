package edu.alenasoft.principlespatterns.patterns.iterator;

import java.util.Map;

public class CreUserIterator implements Iterator<CreUser> {

    private final Map<Integer, UserData> creUsers;
    private final int[] keys;
    private int currentPosition = 0;

    public CreUserIterator(Map<Integer, UserData> creUsers) {
        this.creUsers = creUsers;
        this.keys = creUsers.keySet().stream().mapToInt(Integer::intValue).toArray();
    }

    @Override
    public CreUser next() {
        return new CreUser(this.keys[this.currentPosition], this.creUsers.get(this.keys[this.currentPosition++]));
    }

    @Override
    public boolean isDone() {
        return this.currentPosition >= this.creUsers.size();
    }

    @Override
    public CreUser currentItem() {
        return new CreUser(this.keys[this.currentPosition], this.creUsers.get(this.keys[this.currentPosition]));
    }
}
