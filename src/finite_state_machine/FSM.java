package finite_state_machine;

import java.util.Scanner;
import java.util.ArrayList;

public class FSM {
    private Node startNode;

    public FSM(Node startNode){
        this.startNode = startNode;
    }

    /**
     * Get input of user. The method als check whether input of user is empty or is not A or B.
     * @return s
     */
    public static String getInput(){
        Scanner obj = new Scanner(System.in);
        String s = obj.nextLine();

        while((s.equals("") || !s.matches("[A-B]+"))){
            System.out.println("Input consist of A and B. Try again");
            s = obj.nextLine();
        }
        return s;
    }

    /**
     * The method returns the order of the nodes from the FSM based on the input.
     * @param input
     * @return nodes_input
     */
    public ArrayList<String> simulateFSM(String input){

        ArrayList<String> nodes_input = new ArrayList<>();
         Node currentNode = startNode;
         nodes_input.add(currentNode.getName());

         for (int i= 0; i < input.length(); i++ ){
             Character value = input.charAt(i);
             if (currentNode.getNextNode(value) != null){
                 currentNode  = currentNode.getNextNode(value);
                 nodes_input.add(currentNode.getName());
             }else {
                 nodes_input.add("Transition does not exist");
                 return nodes_input;
             }
         }
        return nodes_input;
    }
}


