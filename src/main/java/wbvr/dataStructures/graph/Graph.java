package wbvr.dataStructures.graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Graph implements IGraph{
    String name;
    Map<GNode, List<GEdge>> graph;

    public Graph(String name) {
        this.name = name;
        graph = new HashMap<>();
    }

    @Override
    public int getNumberOfNodes() {
        return graph.size();
    }

    @Override
    public List<GNode> getNodes() {
        return new ArrayList<>(graph.keySet());
    }

    @Override
    public int getNumberOfEdges() {
        return getEdges().size();
    }

    @Override
    public List<GEdge> getEdges() {
        List<GEdge> edges = new ArrayList<>();
        for (GNode key: graph.keySet()) {
            edges.addAll(graph.get(key));
        }

        return edges;
    }

    @Override
    public GEdge getEdge(GNode source, GNode destination) {
        if (graph.get(source) == null) {
            System.out.println("Source Node not Found.");
            return null;
        }

        for (GEdge edge : graph.get(source)) {
            if (edge.getDestination().equals(destination)){
                return edge;
            }
        }

        System.out.println("Edge not Found.");
        return null;
    }

    @Override
    public int outDegree(GNode node) {
        if (graph.get(node) == null) {
            System.out.println("Node not Found.");
            return 0;
        }

        return graph.get(node).size();
    }

    @Override
    public int inDegree(GNode node) {
        if (graph.get(node) == null) {
            System.out.println("Node not Found.");
            return 0;
        }

        int counter = 0;
        for (GNode key: graph.keySet()) {
            for (GEdge edge : graph.get(key)) {
                if (edge.getDestination().equals(node)){
                    counter++;
                }
            }
        }

        return counter;
    }

    @Override
    public List<GEdge> outgoingEdges(GNode node) {
        if (graph.get(node) == null) {
            System.out.println("Node not Found.");
            return null;
        }

        return graph.get(node);
    }

    @Override
    public List<GEdge> incomingEdges(GNode node) {
        if (graph.get(node) == null) {
            System.out.println("Node not Found.");
            return null;
        }

        for (GNode key: graph.keySet()) {
            List<GEdge> edges = graph.get(key);
            for (GEdge edge : edges) {
                if (edge.getDestination().equals(node)){
                    return edges;
                }
            }
        }

        System.out.println("The Node don't have Incoming Edges.");
        return null;
    }

    @Override
    public void addNode(GNode node) {
        graph.putIfAbsent(node, new ArrayList<>());
    }

    @Override
    public void addEdge(GNode source, GNode destination, int weight) {
        if (getNode(source) == null || getNode(destination) == null) {
            System.out.println("Couldn't add Edge.");
            return;
        }

        graph.get(source).add(new GEdge(source, destination, weight));
    }

    @Override
    public void removeNode(GNode node) {
        if (graph.get(node) == null) {
            System.out.println("Node not Found.");
            return;
        }

        graph.remove(node);
    }

    @Override
    public void removeEdge(GEdge edge) {
        if (graph.get(edge.getSource()) == null) {
            System.out.println("Couldn't add Edge.");
            return;
        }

        graph.get(edge.getSource()).remove(edge);
    }

    public GNode getNode(GNode node) {
        for (GNode n : graph.keySet()) {
            if (n.equals(node)) {
                return node;
            }
        }
        return null;
    }
}
