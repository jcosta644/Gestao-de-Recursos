package state;

import chain.Handler;
import user.Person;

public class CompletedState implements State {
    @Override
    public void nextState(Handler h) {
        h.setState(new InProgressState());
    }
}
