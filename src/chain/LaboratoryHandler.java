package chain;

import state.*;
import user.*;

public class LaboratoryHandler extends Handler{
    public LaboratoryHandler(String name) {
        super(name);
    }

    @Override
    public void addChain(Handler next) {
        super.addChain(next);
    }

    @Override
    public void handleRequest(int type, Person p) {
        if(type == 0) {
            super.setState(new AllocationProcessState());
            super.setResponsible(p);
        } else {
            super.handleRequest(type, p);
        }
    }
}
