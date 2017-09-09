package chain;

public class ClassRoomHandler extends Handler {
    public ClassRoomHandler(String name) {
        super(name);
    }

    @Override
    public void addChain(Handler next) {
        super.addChain(next);
    }
}
