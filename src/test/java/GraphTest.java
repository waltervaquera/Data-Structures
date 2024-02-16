import org.junit.Test;
import wbvr.dataStructures.graph.GEdge;
import wbvr.dataStructures.graph.Graph;
import wbvr.dataStructures.graph.GNode;

import static org.junit.Assert.*;


public class GraphTest {
    private final Graph graph =  new Graph();

    @Test
    public void testAddNodeAndGetNumberOfNodes() {
        assertEquals(0, graph.getNumberOfNodes());
        GNode node1 = new GNode("Node1");
        GNode node2 = new GNode("Node2");
        graph.addNode(node1);
        assertEquals(1, graph.getNumberOfNodes());
        graph.addNode(node2);
        assertEquals(2, graph.getNumberOfNodes());
    }

    @Test
    public void testAddEdgeAndGetNumberOfEdges() {
        assertEquals(0, graph.getNumberOfEdges());
        GNode node1 = new GNode("Node1");
        GNode node2 = new GNode("Node2");
        graph.addNode(node1);
        graph.addNode(node2);
        graph.addEdge(node1, node2, 10);
        assertEquals(1, graph.getNumberOfEdges());
    }

    @Test
    public void testGetNodes() {
        GNode node1 = new GNode("Node1");
        GNode node2 = new GNode("Node2");
        graph.addNode(node1);
        graph.addNode(node2);
        assertTrue(graph.getNodes().contains(node1));
        assertTrue(graph.getNodes().contains(node2));
    }

    @Test
    public void testGetEdges() {
        GNode node1 = new GNode("Node1");
        GNode node2 = new GNode("Node2");
        graph.addNode(node1);
        graph.addNode(node2);
        graph.addEdge(node1, node2, 10);
        assertEquals(1, graph.getEdges().size());
    }

    @Test
    public void testGetEdge() {
        GNode node1 = new GNode("Node1");
        GNode node2 = new GNode("Node2");
        graph.addNode(node1);
        graph.addNode(node2);
        graph.addEdge(node1, node2, 10);
        assertNotNull(graph.getEdge(node1, node2));
    }

    @Test
    public void testOutDegree() {
        GNode node1 = new GNode("Node1");
        GNode node2 = new GNode("Node2");
        GNode node3 = new GNode("Node3");
        graph.addNode(node1);
        graph.addNode(node2);
        graph.addNode(node3);
        graph.addEdge(node1, node2, 10);
        graph.addEdge(node1, node3, 20);
        assertEquals(2, graph.outDegree(node1));
        assertEquals(0, graph.outDegree(node2));
        assertEquals(0, graph.outDegree(node3));
    }

    @Test
    public void testInDegree() {
        GNode node1 = new GNode("Node1");
        GNode node2 = new GNode("Node2");
        GNode node3 = new GNode("Node3");
        graph.addNode(node1);
        graph.addNode(node2);
        graph.addNode(node3);
        graph.addEdge(node1, node2, 10);
        graph.addEdge(node3, node1, 20);
        assertEquals(1, graph.inDegree(node1));
        assertEquals(0, graph.inDegree(node3));
        assertEquals(1, graph.inDegree(node2));
    }

    @Test
    public void testOutgoingEdges() {
        GNode node1 = new GNode("Node1");
        GNode node2 = new GNode("Node2");
        GNode node3 = new GNode("Node3");
        graph.addNode(node1);
        graph.addNode(node2);
        graph.addNode(node3);
        graph.addEdge(node1, node2, 10);
        graph.addEdge(node1, node3, 20);
        graph.addEdge(node2, node3, 30);
        assertEquals(2, graph.outgoingEdges(node1).size());
        assertEquals(1, graph.outgoingEdges(node2).size());
        assertEquals(0, graph.outgoingEdges(node3).size());
    }

    @Test
    public void testIncomingEdges() {
        GNode node1 = new GNode("Node1");
        GNode node2 = new GNode("Node2");
        GNode node3 = new GNode("Node3");
        graph.addNode(node1);
        graph.addNode(node2);
        graph.addNode(node3);
        graph.addEdge(node1, node2, 10);
        graph.addEdge(node3, node1, 20);
        graph.addEdge(node3, node2, 30);
        assertEquals(1, graph.incomingEdges(node1).size());
        assertEquals(2, graph.incomingEdges(node2).size());
        assertEquals(0, graph.incomingEdges(node3).size());
    }

    @Test
    public void testRemoveNode() {
        GNode node1 = new GNode("Node1");
        GNode node2 = new GNode("Node2");
        GNode node3 = new GNode("Node3");
        graph.addNode(node1);
        graph.addNode(node2);
        graph.addNode(node3);
        graph.addEdge(node1, node2, 10);
        graph.addEdge(node3, node1, 20);
        assertEquals(3, graph.getNumberOfNodes());
        assertEquals(2, graph.getNumberOfEdges());

        graph.removeNode(node1);
        assertEquals(2, graph.getNumberOfNodes());
        assertEquals(0, graph.incomingEdges(node2).size());
        assertEquals(0, graph.outgoingEdges(node2).size());
    }

    @Test
    public void testRemoveEdge() {
        GNode node1 = new GNode("Node1");
        GNode node2 = new GNode("Node2");
        GNode node3 = new GNode("Node3");
        graph.addNode(node1);
        graph.addNode(node2);
        graph.addNode(node3);
        graph.addEdge(node1, node2, 10);
        graph.addEdge(node3, node1, 20);
        assertEquals(2, graph.getNumberOfEdges());

        GEdge edgeToRemove = graph.getEdge(node3, node1);
        assertNotNull(edgeToRemove);

        graph.removeEdge(edgeToRemove);
        assertEquals(1, graph.getNumberOfEdges());
        assertNull(graph.getEdge(node3, node1));
    }
}
