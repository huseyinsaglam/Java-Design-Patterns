package behavioral._16_iterator.testIterator;

import behavioral._16_iterator.repository.NameRepository;

import java.util.Iterator;

public class IteratorPatternDemo {

    public static void main(String[] args) {

        NameRepository nameRepository = new NameRepository();
        for (Iterator itr = nameRepository.getIterator(); itr.hasNext();){
            String name = (String) itr.next();
            System.out.println(name);
        }

    }
}
