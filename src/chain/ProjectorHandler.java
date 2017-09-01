package chain;

import state.State;

public class ProjectorHandler implements Handler {
    private static int nextID = 1;
    private int id = nextID++;
    private State state;
    private ProjectorHandler nextInChain;
}
