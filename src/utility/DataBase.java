package utility;

import com.sun.deploy.util.ReflectionUtil;
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

    public ArrayList<Person> getPersonList() {
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

    public int getQuantityProjector() {
        int n = 0;
        for(Handler h : resource) {
            if(h instanceof ProjectorHandler) {
                n++;
            }
        }
        return n;
    }

    public int getQuantityLaboratory() {
        int n = 0;
        for(Handler h : resource) {
            if(h instanceof LaboratoryHandler) {
                n++;
            }
        }
        return n;
    }

    public int getQuantityClassRoom() {
        int n = 0;
        for(Handler h : resource) {
            if(h instanceof ClassRoomHandler) {
                n++;
            }
        }
        return n;
    }

    public int getQuantityAuditory() {
        int n = 0;
        for(Handler h : resource) {
            if(h instanceof AuditoryHandler) {
                n++;
            }
        }
        return n;
    }

    public int getQuantityMasterStudent() {
        int n = 0;
        for(Person p : person) {
            if(p instanceof MasterStudent) {
                n++;
            }
        }
        return n;
    }

    public int getQuantityPhDStudent() {
        int n = 0;
        for(Person p : person) {
            if(p instanceof PhDStudent) {
                n++;
            }
        }
        return n;
    }

    public int getQuantityProfessor() {
        int n = 0;
        for(Person p : person) {
            if(p instanceof Professor) {
                n++;
            }
        }
        return n;
    }

    public int getQuantityResearcher() {
        int n = 0;
        for(Person p : person) {
            if(p instanceof Reseacher) {
                n++;
            }
        }
        return n;
    }

    public int getQuantityUndergraduateStudent() {
        int n = 0;
        for(Person p : person) {
            if(p instanceof UndergraduateStundent) {
                n++;
            }
        }
        return n;
    }
}

