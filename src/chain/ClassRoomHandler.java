package chain;

import state.*;
import user.*;

public class ClassRoomHandler extends Handler {
    public ClassRoomHandler(String name) {
        super(name);
    }

    @Override
    public void addChain(Handler next) {
        super.addChain(next);
    }

    @Override
    public void handleRequest(int type, Person p) {
        if(type == 2) {
            super.setState(new AllocationProcessState());
            super.setResponsible(p);
        } else {
            super.handleRequest(type, p);
        }
    }

    @Override
    public String toString() {
        return super.toString("Sala de Aula");
    }
}
