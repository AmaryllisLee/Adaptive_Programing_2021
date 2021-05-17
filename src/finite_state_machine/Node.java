package finite_state_machine;

import java.util.ArrayList;

public class Node {
    private String name; // defining the states
    private ArrayList<Transition> transitions = new ArrayList<>();

    public Node(String name){
        this.name =name;
    }

    public void setName(String name){this.name = name;}
    public String getName(){return name;}
    public void addtransition(Transition transition){ transitions.add(transition); }

    public Node getNextNode(Character value){
        for (int j= 0; j< transitions.size(); j++){
            if(transitions.get(j).getValue() == value){
                return transitions.get(j).getConnectedNode();
            }
        }
        return null;
    }

}

