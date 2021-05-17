package finite_state_machine;

import java.util.ArrayList;

public class Node {
    String name; // defining the states
    ArrayList<Transition> transitions = new ArrayList<>();

    public Node(String name){
        this.name =name;
    }

    public void setName(String name){this.name = name;}
    public String getName(){return name;}
    public void addtransition(Transition transition){
        transitions.add(transition);
    }

}

