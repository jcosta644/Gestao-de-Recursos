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
}
