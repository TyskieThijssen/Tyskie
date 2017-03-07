package oose.ooad.Factories;

import oose.ooad.Persons.Houthakker;
import oose.ooad.Interfaces.IPerson;
import oose.ooad.Persons.Melkboer;

/**
 * Created by tyskie on 3/7/17.
 */
public class PersonFactory {
    public IPerson createPerson(String naam){
        if(naam == "Melkboer"){
            return new Melkboer();
        } else if(naam == "Houthakker"){
            return new Houthakker();
        } else {
            return null;
        }
    }
}
