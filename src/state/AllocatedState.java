package state;

import chain.Handler;
import user.Person;

public class AllocatedState implements State {
    @Override
    public void nextState(Person p, Handler h) {
        if(p.equals(h.getResponsible())) {
            h.setState(new CompletedState());
        }
    }
}
