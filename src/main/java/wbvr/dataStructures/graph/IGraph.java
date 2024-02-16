package wbvr.dataStructures.graph;

import java.util.List;

public interface IGraph {

    /**
     * Returns the number of nodes in the graph
     * @return number of nodes
     */
    int getNumberOfNodes();

    /**
     * Returns a list of all node in the graph
     * @return list of all nodes
     */
    List<GNode> getNodes();

    /**
     * Returns the number of edges in the graph
     * @return number of edges
     */
    int getNumberOfEdges();

    /**
     * Returns a list of all edges in the graph
     * @return list of all edges
     */
    List<GEdge> getEdges();

    /**
     * Returns an edge in the graph with the specify source and destination
     * @param source source node
     * @param destination destination node
     * @return found edge
     */
    GEdge getEdge(GNode source, GNode destination);

    /**
     * Returns the number of outgoing edges from a specific node in the graph
     * @param node the node to be analyzed
     * @return number of outgoing edges from a node
     */
    int outDegree(GNode node);

    /**
     * Returns the number of incoming edges from a specific node in the graph
     * @param node the node to be analyzed
     * @return number of incoming edges from a node
     */
    int inDegree(GNode node);

    /**
     * Returns the list of outgoing edges from a node in the graph
     * @param node the node to be analyzed
     * @return list of outgoing edges from a node
     */
    List<GEdge> outgoingEdges(GNode node);

    /**
     * Returns the list of incoming edges from a node in the graph
     * @param node the node to be analyzed
     * @return list of incoming edges from a node
     */
    List<GEdge> incomingEdges(GNode node);

    /**
     * Adds a new node in the graph
     * @param node the node to be added
     */
    void addNode (GNode node);

    /**
     * Add a new edge in the graph with the desired source, destination and weight
     * @param source source node
     * @param destination destination node
     * @param weight weight of the edge
     */
    void addEdge (GNode source, GNode destination, int weight);

    /**
     * Searches and removes a node in the graph
     * @param node node to be deleted
     */
    void removeNode (GNode node);

    /**
     * Searches and removes a edge in the graph
     * @param edge edge to be deleted
     */
    void removeEdge (GEdge edge);
}
