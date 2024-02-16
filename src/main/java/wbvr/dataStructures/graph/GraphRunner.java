package wbvr.dataStructures.graph;

import wbvr.dataStructures.IRunner;

import java.util.List;
import java.util.Scanner;

public class GraphRunner implements IRunner {
    @Override
    public void run() {
        Graph graph = new Graph();
        System.out.println("Graph Created.");

        Scanner scanner = new Scanner(System.in);
        String choice;

        do {
            printMenu();
            System.out.print("Enter your choice: ");
            choice = scanner.nextLine();
            action(choice, graph);
        } while (!choice.equals("N"));
    }

    private static void printMenu() {
        System.out.println("------------------------");
        System.out.println("Choose a Graph Action:");
        System.out.println("A: getNumberOfNodes");
        System.out.println("B: getNodes");
        System.out.println("C: getNumberOfEdges");
        System.out.println("D: getEdges");
        System.out.println("E: getEdge");
        System.out.println("F: outDegree");
        System.out.println("G: inDegree");
        System.out.println("H: outgoingEdges");
        System.out.println("I: incomingEdges");
        System.out.println("J: addNode");
        System.out.println("K: addEdge");
        System.out.println("L: removeNode");
        System.out.println("M: removeEdge");
        System.out.println("N: Exit Menu");
        System.out.println("------------------------");
    }

    private void action(String choice, Graph graph) {
        Scanner scanner = new Scanner(System.in);
        GNode source;
        GNode destination;
        int weight;
        switch (choice) {
            case "A":
                System.out.println("The Number of Nodes is: " + graph.getNumberOfNodes());
                break;
            case "B":
                System.out.print("Nodes in the Tree: ");
                for (GNode node : graph.getNodes()) {
                    System.out.print(node + " ");
                }
                System.out.println();
                break;
            case "C":
                System.out.println("The Number of Edges is: " + graph.getNumberOfEdges());
                break;
            case "D":
                System.out.print("Edges in the Tree: ");
                for (GEdge edge : graph.getEdges()) {
                    System.out.print(edge + ", ");
                }
                System.out.println();
                break;
            case "E":
                System.out.print("Enter the Origin Node of the Edge: ");
                source = new GNode(scanner.nextLine());
                System.out.print("Enter the Destination Node of the Edge: ");
                destination = new GNode(scanner.nextLine());
                GEdge foundEdge = graph.getEdge(source, destination);

                if (foundEdge == null) {
                    System.out.println("Edge not Found.");
                    break;
                }

                System.out.println("Found Edge: " + foundEdge);
                break;
            case "F":
                System.out.print("Enter the Node: ");
                System.out.println("Out Degree of the Node: " + graph.outDegree(new GNode(scanner.nextLine())));
                break;
            case "G":
                System.out.print("Enter the Node: ");
                System.out.println("In Degree of the Node: " + graph.inDegree(new GNode(scanner.nextLine())));
                break;
            case "H":
                System.out.print("Enter the Node: ");
                List<GEdge> outgoingEdges = graph.outgoingEdges(new GNode(scanner.nextLine()));

                if (outgoingEdges == null) {
                    break;
                }

                System.out.print("Outgoing Edges of the Node: ");
                for (GEdge edge : outgoingEdges) {
                    System.out.print(edge + ", ");
                }
                System.out.println();
                break;
            case "I":
                System.out.print("Enter the Node: ");
                List<GEdge> incomingEdges = graph.incomingEdges(new GNode(scanner.nextLine()));

                if (incomingEdges == null) {
                    break;
                }

                System.out.print("Incoming Edges of the Node: ");
                for (GEdge edge : incomingEdges) {
                    System.out.print(edge + ", ");
                }
                System.out.println();
                break;
            case "J":
                System.out.print("Enter the Node to Add: ");
                graph.addNode(new GNode(scanner.nextLine()));

                System.out.println("Node Successfully Added.");
                System.out.print("Nodes in the Tree: ");
                for (GNode node : graph.getNodes()) {
                    System.out.print(node + " ");
                }
                System.out.println();
                break;
            case "K":
                System.out.print("Enter the Origin Node of the Edge: ");
                source = new GNode(scanner.nextLine());
                System.out.print("Enter the Destination Node of the Edge: ");
                destination = new GNode(scanner.nextLine());
                System.out.print("Enter the Weight Node of the Edge: ");
                weight = scanner.nextInt();

                graph.addEdge(source, destination, weight);

                if (graph.getEdge(source, destination) != null) {
                    System.out.println("Edge Successfully Added.");
                    System.out.print("Edges in the Tree: ");
                    for (GEdge edge : graph.getEdges()) {
                        System.out.print(edge + ", ");
                    }
                    System.out.println();
                }
                break;
            case "L":
                System.out.print("Enter the Node to Remove: ");
                GNode nodeToRemove = new GNode(scanner.nextLine());

                graph.removeNode(nodeToRemove);
                System.out.println("Node Successfully Removed.");
                System.out.print("Nodes in the Tree: ");
                for (GNode node : graph.getNodes()) {
                    System.out.print(node + " ");
                }
                System.out.println();
                break;
            case "M":
                System.out.print("Enter the Origin Node of the Edge: ");
                source = new GNode(scanner.nextLine());
                System.out.print("Enter the Destination Node of the Edge: ");
                destination = new GNode(scanner.nextLine());
                System.out.print("Enter the Weight Node of the Edge: ");
                weight = scanner.nextInt();

                if (graph.getEdge(source, destination) == null) {
                    System.out.println("Edge not Found.");
                    break;
                }

                graph.removeEdge(new GEdge(source, destination, weight));
                System.out.println("Edge Successfully Removed.");
                System.out.print("Edges in the Tree: ");
                for (GEdge edge : graph.getEdges()) {
                    System.out.print(edge + ", ");
                }
                System.out.println();
                break;
            case "N":
                System.out.println("Exiting Menu...");
                break;
            default:
                System.out.println("Invalid Choice.");
        }
    }
}
