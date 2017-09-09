package chain;

public class AuditoryHandler extends Handler {

    public AuditoryHandler(String name) {
        super(name);
    }

    @Override
    public void addChain(Handler next) {
        super.addChain(next);
    }
}
