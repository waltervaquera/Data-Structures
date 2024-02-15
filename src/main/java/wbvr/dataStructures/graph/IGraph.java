package wbvr.dataStructures.graph;

import java.util.List;

public interface IGraph {
    int getNumberOfNodes();
    List<GNode> getNodes();
    int getNumberOfEdges();
    List<GEdge> getEdges();
    GEdge getEdge(GNode source, GNode destination);
    int outDegree(GNode node);
    int inDegree(GNode node);
    List<GEdge> outgoingEdges(GNode node);
    List<GEdge> incomingEdges(GNode node);
    void addNode (GNode node);
    void addEdge (GNode source, GNode destination, int weight);
    void removeNode (GNode node);
    void removeEdge (GEdge edge);
}
