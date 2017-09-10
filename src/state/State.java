package state;

import chain.*;
import user.*;

public interface State {
    public void nextState(Handler h);
    public String toString();

}
