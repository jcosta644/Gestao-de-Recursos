package chain;

public class AuditoryHandler implements Handler {
    private static int nextID = 1;
    private int id = nextID++;
    private AuditoryHandler nextInChain;
}
