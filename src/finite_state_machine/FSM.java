package finite_state_machine;


public class FSM {
    Node startNode;

    public FSM(Node startNode){
        this.startNode = startNode;
    }

    public void  simulateFSM(String input){
         Node currentNode = startNode;
         System.out.println(currentNode);

         for (int i= 0; i < input.length(); i++ ){
             Character value = input.charAt(i);

             for (int j= 0; j< currentNode.transitions.size(); j++){
                 if(currentNode.transitions.get(j).getValue() == value){
                     currentNode = currentNode.transitions.get(j).getConnectedNode();
                     break;
                 }

             }
             System.out.println(currentNode.getName());
         }
    }
}
