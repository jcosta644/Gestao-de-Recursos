package state;

import chain.Handler;
import user.Person;

public class AllocationProcessState implements State {
    @Override
    public void nextState(Handler h) {
        h.setState(new AllocatedState());
    }
}
