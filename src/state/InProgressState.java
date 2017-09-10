package state;

import chain.Handler;
import user.Person;

public class InProgressState implements State {
    @Override
    public void nextState(Handler h) {
        h.setState(new AllocationProcessState());
    }

    @Override
    public String toString() {
        return "Em Andamento";
    }
}
