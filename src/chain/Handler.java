package chain;

import user.*;
import state.*;

public abstract class Handler {
    private static int nextID = 1;
    private int ID = nextID++;
    private String name;
    private Handler nextInChain;
    private Person responsible;
    private State state;

    public Handler() {
    }

    public Handler(String name) {
        this.name = name;
        this.state = null;
        this.nextInChain = null;
        this.responsible = null;
    }

    public int getId() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Handler getNextInChain() {
        return nextInChain;
    }

    public void setNextInChain(Handler nextInChain) {
        this.nextInChain = nextInChain;
    }

    public Person getResponsible() {
        return responsible;
    }

    public void setResponsible(Person responsible) {
        this.responsible = responsible;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void addChain(Handler next) {
        if (nextInChain == null) {
            nextInChain = next;
        } else {
            nextInChain.addChain(next);
        }
    }

    public void handleRequest(int type, Person p) {
        if (nextInChain != null) {
            nextInChain.handleRequest(type, p);
        }
    }
}
