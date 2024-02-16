package wbvr.dataStructures.graph;

import wbvr.dataStructures.IRunner;

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
        GNode node;
        GEdge edge;
        GNode source;
        GNode destination;
        int weight;

        switch (choice) {
            case "A":
                System.out.println("The Number of Nodes is: " + graph.getNumberOfNodes());
                break;
            case "B":
                System.out.println("Nodes in the Tree: " + graph.getNodes());
                break;
            case "C":
                System.out.println("The Number of Edges is: " + graph.getNumberOfEdges());
                break;
            case "D":
                System.out.println("Edges in the Tree: " + graph.getEdges());
                break;
            case "E":
                System.out.print("Enter the Origin Node of the Edge: ");
                source = new GNode(scanner.nextLine());
                System.out.print("Enter the Destination Node of the Edge: ");
                destination = new GNode(scanner.nextLine());

                GEdge foundEdge = graph.getEdge(source, destination);

                if (foundEdge != null) {
                    System.out.println("Edge found: " + foundEdge);
                    break;
                }

                System.out.println("Edge not found.");
                break;
            case "F":
                System.out.print("Enter the Node: ");
                node = new GNode(scanner.nextLine());

                if (graph.nodeExists(node)) {
                    System.out.println("Out Degree of the Node: " + graph.outDegree(node));
                    break;
                }

                System.out.println("Node don't Found, there is no Out Degree.");
                break;
            case "G":
                System.out.print("Enter the Node: ");
                node = new GNode(scanner.nextLine());

                if (graph.nodeExists(node)) {
                    System.out.println("In Degree of the Node: " + graph.inDegree(node));
                    break;
                }

                System.out.println("Node not Found, there is no In Degree.");
                break;
            case "H":
                System.out.print("Enter the Node: ");
                node = new GNode(scanner.nextLine());

                if (graph.nodeExists(node)) {
                    System.out.println("Outgoing Edges of the Node: " + graph.outgoingEdges(node));
                    break;
                }

                System.out.println("Node not Found, there is no Outgoing Edges.");
                break;
            case "I":
                System.out.print("Enter the Node: ");
                node = new GNode(scanner.nextLine());

                if (graph.nodeExists(node)) {
                    System.out.println("Incoming Edges of the Node: " + graph.incomingEdges(node));
                    break;
                }

                System.out.println("Node not Found, there is no Incoming Edges.");
                break;
            case "J":
                System.out.print("Enter the Node to Add: ");
                graph.addNode(new GNode(scanner.nextLine()));

                System.out.println("Node Successfully Added.");
                System.out.println("Nodes in the Tree: " + graph.getNodes());
                break;
            case "K":
                System.out.print("Enter the Origin Node of the Edge: ");
                source = new GNode(scanner.nextLine());
                System.out.print("Enter the Destination Node of the Edge: ");
                destination = new GNode(scanner.nextLine());
                System.out.print("Enter the Weight Node of the Edge: ");
                weight = scanner.nextInt();

                if (graph.nodeExists(source) && graph.nodeExists(destination)) {
                    graph.addEdge(source, destination, weight);
                    System.out.println("Edge Successfully Added.");
                    System.out.println("Edges in the Tree: " + graph.getEdges());
                    break;
                }

                System.out.println("Invalid Source or Destination Node.");
                break;
            case "L":
                System.out.print("Enter the Node to Remove: ");
                node = new GNode(scanner.nextLine());

                if (graph.nodeExists(node)) {
                    graph.removeNode(node);
                    System.out.println("Node Successfully Removed.");
                    System.out.println("Nodes in the Tree: " + graph.getNodes());
                    break;
                }

                System.out.println("Node not Found, there is no Node to Remove.");
                break;
            case "M":
                System.out.print("Enter the Origin Node of the Edge: ");
                source = new GNode(scanner.nextLine());
                System.out.print("Enter the Destination Node of the Edge: ");
                destination = new GNode(scanner.nextLine());
                System.out.print("Enter the Weight Node of the Edge: ");
                weight = scanner.nextInt();

                edge = new GEdge(source, destination, weight);

                if (graph.edgeExists(edge)) {
                    graph.removeEdge(new GEdge(source, destination, weight));
                    System.out.println("Edge Successfully Removed.");
                    System.out.println("Edges in the Tree: " + graph.getEdges());
                    break;
                }

                System.out.println("Edge not Found, there is no Edge to Remove.");
                break;
            case "N":
                System.out.println("Exiting Menu...");
                break;
            default:
                System.out.println("Invalid Choice.");
        }
    }
}
