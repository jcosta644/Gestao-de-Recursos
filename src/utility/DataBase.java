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

    public ArrayList<Person> getPersonlist() {
        return person;
    }

    public ArrayList<Handler> getResourceList() {
        return resource;
    }

    public Person getPerson(String cpf) {
        for(Person p : person) {
            if(p.getCpf().equals(cpf)) {
                return p;
            }
        }
        return null;
    }

    public Handler getResource(int ID) {
        for(Handler h : resource) {
            if(h.getId() == ID) {
                return h;
            }
        }
        return null;
    }

    public Handler getChain() {
        return chain;
    }
}

