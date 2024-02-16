package wbvr.dataStructures.graph;

public class GEdge {
    public GNode source;
    public GNode destination;
    public int weight;

    public GEdge(GNode source, GNode destination, int weight) {
        this.source = source;
        this.destination = destination;
        this.weight = weight;
    }

    public GNode getSource() {
        return source;
    }

    public GNode getDestination() {
        return destination;
    }

    public int getWeight() {
        return weight;
    }

    public void setSource(GNode source) {
        this.source = source;
    }

    public void setDestination(GNode destination) {
        this.destination = destination;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "[" + source + " to " + destination + ", cost: " + weight + "]";
    }
}
