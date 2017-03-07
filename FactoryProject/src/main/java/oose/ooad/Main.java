package oose.ooad;

import oose.ooad.Factories.PersonFactory;
import oose.ooad.Interfaces.IPerson;

/**
 * Created by tyskie on 3/7/17.
 */
public class Main {
    public static void main(String[] args) {
        PersonFactory personFactory = new PersonFactory();
        IPerson person = personFactory.createPerson("Houthakker");
        person.work();
    }
}
