package wbvr.dataStructures.graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Graph implements IGraph {
    private final Map<GNode, List<GEdge>> adjacencyMap;
    private final List<GNode> nodeList;
    private final List<GEdge> edgeList;

    public Graph() {
        adjacencyMap = new HashMap<>();
        nodeList = new ArrayList<>();
        edgeList = new ArrayList<>();
    }

    @Override
    public int getNumberOfNodes() {
        return nodeList.size();
    }

    @Override
    public List<GNode> getNodes() {
        return nodeList;
    }

    @Override
    public int getNumberOfEdges() {
        return edgeList.size();
    }

    @Override
    public List<GEdge> getEdges() {
        return edgeList;
    }

    @Override
    public GEdge getEdge(GNode source, GNode destination) {
        List<GEdge> edges = adjacencyMap.get(source);
        if (edges != null) {
            for (GEdge edge : edges) {
                if (edge.getDestination().equals(destination)) {
                    return edge;
                }
            }
        }

        return null;
    }

    @Override
    public int outDegree(GNode node) {
        List<GEdge> edges = adjacencyMap.get(node);
        return edges != null ? edges.size() : 0;
    }

    @Override
    public int inDegree(GNode node) {
        int count = 0;
        for (GNode n : nodeList) {
            List<GEdge> edges = adjacencyMap.get(n);
            if (edges != null) {
                for (GEdge edge : edges) {
                    if (edge.getDestination().equals(node)) {
                        count++;
                    }
                }
            }
        }

        return count;
    }

    @Override
    public List<GEdge> outgoingEdges(GNode node) {
        return adjacencyMap.getOrDefault(node, new ArrayList<>());
    }

    @Override
    public List<GEdge> incomingEdges(GNode node) {
        List<GEdge> incomingEdges = new ArrayList<>();
        for (GNode n : nodeList) {
            List<GEdge> edges = adjacencyMap.get(n);
            if (edges != null) {
                for (GEdge edge : edges) {
                    if (edge.getDestination().equals(node)) {
                        incomingEdges.add(edge);
                    }
                }
            }
        }

        return incomingEdges;
    }

    @Override
    public void addNode(GNode node) {
        if (!adjacencyMap.containsKey(node)) {
            adjacencyMap.put(node, new ArrayList<>());
            nodeList.add(node);
        }
    }

    @Override
    public void addEdge(GNode source, GNode destination, int weight) {
        GEdge edge = new GEdge(source, destination, weight);
        adjacencyMap.getOrDefault(source, new ArrayList<>()).add(edge);
        edgeList.add(edge);
    }

    @Override
    public void removeNode(GNode node) {
        nodeList.remove(node);
        adjacencyMap.remove(node);
        edgeList.removeIf(edge -> edge.getSource().equals(node) || edge.getDestination().equals(node));
        for (GNode n : nodeList) {
            adjacencyMap.get(n).removeIf(edge -> edge.getDestination().equals(node));
        }
    }

    @Override
    public void removeEdge(GEdge edge) {
        edgeList.remove(edge);
        adjacencyMap.get(edge.getSource()).remove(edge);
    }

    public boolean nodeExists(GNode nodeToCheck) {
        for (GNode node : nodeList) {
            if (node.equals(nodeToCheck)) {
                return true;
            }
        }
        return false;
    }

    public boolean edgeExists(GEdge edgeToCheck) {
        for (GEdge edge : edgeList) {
            if (edge.equals(edgeToCheck)) {
                return true;
            }
        }
        return false;
    }
}
