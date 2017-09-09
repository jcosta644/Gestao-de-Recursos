package state;

import chain.*;
import user.*;

public interface State {
    public void nextState(Person p, Handler h);
}
