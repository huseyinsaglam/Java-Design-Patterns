package behavioral._16_iterator.Iterator;

import behavioral._16_iterator.repository.NameRepository;

import java.util.Iterator;

public class NameIterator implements Iterator {

    NameRepository nameRepository = new NameRepository();

    String names[] = nameRepository.names;

    int index;

    @Override
    public boolean hasNext() {

        if (index < names.length){
            return true;
        }
        return false;
    }

    @Override
    public Object next() {

        if (hasNext()){
            return names[index++];
        }
        return null;
    }
}
