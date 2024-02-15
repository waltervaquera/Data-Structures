package wbvr.dataStructures.graph;

public class GNode {
    String name;

    public GNode(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}
