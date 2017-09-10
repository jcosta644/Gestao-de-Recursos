package chain;

import state.*;
import user.*;

public class AuditoryHandler extends Handler {

    public AuditoryHandler(String name) {
        super(name);
    }

    @Override
    public void addChain(Handler next) {
        super.addChain(next);
    }

    @Override
    public void handleRequest(int type, Person p) {
        if(type == 1) {
            super.setState(new AllocationProcessState());
            super.setResponsible(p);
        } else {
            super.handleRequest(type, p);
        }
    }

    @Override
    public String toString() {
        return super.toString("Auditorio");
    }
}
