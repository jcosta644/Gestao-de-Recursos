package chain;

public class LaboratoryHandler implements Handler{
    private static int nextID = 1;
    private int id = nextID++;
    private LaboratoryHandler nextInChain;
}
