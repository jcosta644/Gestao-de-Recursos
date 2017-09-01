package chain;

public class ProjectorHandler implements Handler {
    private static int nextID = 1;
    private int id = nextID++;
    private ProjectorHandler nextInChain;
}
