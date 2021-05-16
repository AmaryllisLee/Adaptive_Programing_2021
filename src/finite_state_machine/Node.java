package finite_state_machine;

import java.util.ArrayList;

public class Node {
    String name; // defining the states
    ArrayList<Transition> transitions = new ArrayList<>();
    Node pathA;// defining the path A
    Node pathB;// defining the path B

    public Node(String name){
        this.name =name;
    }
//    public void setNodeOnPathA(Node node)
//    {
//        pathA =  node;
//    }
//
//    public void setNodeOnPathB(Node node)
//    {
//        pathB  = node;
//    }

    public void setName(String name){this.name = name;}
    public String getName(){return name;}
    public void addtransition(Transition transition){
        transitions.add(transition);
    }
//    public Node getNodeOnPathA(){return pathA;}
//    public Node getNodeOnPathB(){return pathB;}

    public String toString(){
        return name;


}}
