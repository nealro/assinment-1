package com.name;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;

public class Main {
    public static ArrayList<Node> graph;
    public static void main(String[] args) throws FileNotFoundException {
        setupTree();
        BFS();
    }

    private static void BFS() {
        Queue<Integer> leafNode = new LinkedList<>();
        HashSet<Integer> queueNode = new HashSet<>();
        Node start = graph.get(0);
        if( start == null ) {
            System.out.println( "Graph is empty" );
            return;
        }
        leafNode.add( start.getKey() );
        queueNode.add( start.getKey() );
        while ( !leafNode.isEmpty() ) {
            Integer thisKey = leafNode.poll();
            Node thisNode = graph.get( thisKey - 1 );
            System.out.println( "Leaf " + thisNode.toString() );
            thisNode.setVisited( true );
            List<Integer> nodesThatCanBeExplored = graph.get(thisKey - 1).getNodes();
            for( Integer key : nodesThatCanBeExplored ) {
                Node node = graph.get( key - 1 );
                if( node.isVisited() || queueNode.contains( node.getKey() ) ) {
                    continue;
                }
                leafNode.add( key );
                queueNode.add( key );
            }
        }
    }
    private static void setupTree() throws FileNotFoundException {
        graph = new ArrayList<>();
        Scanner scan = new Scanner( new File("tree.txt") );
        while ( scan.hasNext() ) {
            String line = scan.nextLine();
            parseLine( line );
        }
    }
    private static void parseLine(String line) {
        String[] keys = line.split(" ");
        int key = Integer.parseInt( keys[0] );
        ArrayList<Integer> points = new ArrayList<>();
        for(int i = 1; i < keys.length;i++) {
            points.add( Integer.parseInt( keys[i] ) );
        }
        graph.add( new Node(key, points) );
    }
}