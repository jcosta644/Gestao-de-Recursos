package state;

import chain.Handler;
import user.Person;

public class AllocatedState implements State {
    @Override
    public void nextState(Handler h) {
        h.setState(new CompletedState());
    }

    @Override
    public String toString() {
        return "Alocado";
    }
}
