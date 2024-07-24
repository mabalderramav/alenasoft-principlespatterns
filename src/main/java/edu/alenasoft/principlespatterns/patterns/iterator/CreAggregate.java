package edu.alenasoft.principlespatterns.patterns.iterator;

public class CreAggregate implements Aggregate {

    private final CreApiClient creApiClient;

    public CreAggregate() {
        creApiClient = new CreApiClient();
    }

    @Override
    public Iterator createIterator() {
        return new CreUserIterator(creApiClient.getCreUsers());
    }
}
