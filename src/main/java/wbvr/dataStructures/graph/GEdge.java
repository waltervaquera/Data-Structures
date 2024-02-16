package wbvr.dataStructures.graph;

import java.util.Objects;

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

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        GEdge other = (GEdge) obj;
        return source.equals(other.source) && destination.equals(other.destination) && weight == other.weight;
    }

    @Override
    public int hashCode() {
        return Objects.hash(source, destination, weight);
    }

    @Override
    public String toString() {
        return "[" + source + " to " + destination + ", cost: " + weight + "]";
    }
}
