package finite_state_machine;

public class Node {
    String name; // defining the states
    Node pathA;// defining the path A
    Node pathB;// defining the path B

    public Node(String n){
        name =n;
    }




    public void setNodeOnPathA(Node node)
    {
        pathA =  node;
    }

    public void setNodeOnPathB(Node node)
    {
        pathB  = node;
    }

    public String getName(){return name;}

    public Node getNodeOnPathA(){return pathA;}
    public Node getNodeOnPathB(){return pathB;}

    public String toString(){
        return name;


}}
