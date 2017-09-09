package state;

import chain.Handler;
import user.Person;

public class AllocationProcessState implements State {
    @Override
    public void nextState(Person p, Handler h) {
        if(p.equals(h.getResponsible())) {
            h.setState(new AllocatedState());
        }
    }
}
