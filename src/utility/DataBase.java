package utility;

import user.*;
import chain.*;

import java.util.ArrayList;
import java.util.List;
/**
 * Created by HP on 09/09/2017.
 */
public class DataBase {
    private ArrayList<Person> person;
    private ArrayList<Handler> resource;
    private Handler chain;

    public DataBase() {
        this.person = new ArrayList<Person>();
        this.resource = new ArrayList<Handler>();
    }

    public void addPerson(Person person) {
        this.person.add(person);
    }

    public void addResource(Handler resource) {
        this.resource.add(resource);
        chain.addChain(resource);
    }

    public ArrayList<Person> getPerson() {
        return person;
    }

    public ArrayList<Handler> getResource() {
        return resource;
    }
}

