package finite_state_machine;

import java.util.Scanner;
import java.util.ArrayList;

public class FSM {
    Node startNode;

    public FSM(Node startNode){
        this.startNode = startNode;
    }


    public static String getInput(){
        Scanner obj = new Scanner(System.in);
        String s = obj.nextLine();

        while((s.equals("") || !s.matches("[A-B]+"))){
            System.out.println("Input consist of A and B. Try again");
            s = obj.nextLine();
        }


        return s;
    }
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

//https://stackoverflow.com/questions/1119385/junit-test-for-system-out-println
