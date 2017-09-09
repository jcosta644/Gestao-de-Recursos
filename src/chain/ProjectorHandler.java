package chain;

public class ProjectorHandler extends Handler {
    public ProjectorHandler(String name) {
        super(name);
    }

    @Override
    public void addChain(Handler next) {
        super.addChain(next);
    }
}
