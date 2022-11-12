package behavioral._16_iterator.repository;

import behavioral._16_iterator.Iterator.NameIterator;

import java.util.Iterator;

public class NameRepository implements Container {

    public String names[] = {"Ali", "Ahmet", "Mehmet", "Huseyin"};

    @Override
    public Iterator getIterator() {
        return new NameIterator();
    }
}
