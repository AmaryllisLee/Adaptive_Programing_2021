package finite_state_machine;

public class Transition {
    private Character value;
    private Node connectedNode;

    public Transition(Node connectedNode, Character value){
        this.connectedNode = connectedNode;
        this.value = value;
    }

    public Character getValue() {
        return value;
    }

    public Node getConnectedNode() {
        return connectedNode;
    }




}
