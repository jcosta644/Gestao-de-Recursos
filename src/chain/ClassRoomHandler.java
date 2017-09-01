package chain;

public class ClassRoomHandler implements Handler {
    private static int nextID = 1;
    private int id = nextID++;
    private ClassRoomHandler nextInChain;
}
