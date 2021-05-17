package finite_state_machine;

import java.util.Scanner;

import static finite_state_machine.FSM.getInput;

public class Main {
    public static void main(String[] arg) {
        // Define the FSM of formatieve opdracht 2

        //Define the nodes
        Node s0 = new Node("s0");
        Node s1 = new Node("s1");
        Node s2 = new Node("s2");
        Node s3 = new Node("s3");
        // Define the transitions
        Transition s0_s1  = new Transition(s1, 'B');
        Transition s0_s2  = new Transition(s2, 'A');
        Transition s1_s1  = new Transition(s1, 'A');
        Transition s1_s2  = new Transition(s2, 'B');
        Transition s2_s3  = new Transition(s3, 'B');
        Transition s3_s3  = new Transition(s3, 'A');
        Transition s3_s0  = new Transition(s0, 'B');

        s0.addtransition(s0_s1);
        s0.addtransition(s0_s2);
        s1.addtransition(s1_s1);
        s1.addtransition(s1_s2);
        s2.addtransition(s2_s3);
        s3.addtransition(s3_s3);
        s3.addtransition(s3_s0);


        FSM form2A = new FSM(s0); // create your model
        String s = getInput();

        System.out.println(form2A.simulateFSM(s));

        // Test :
        // true: BAAB
        // AAB : should return [s0, s2 " Transiiton doe not exist]

        // Define the FSM for the second example: " own design "

        Node n0  = new Node("n0");
        Node n1  = new Node("n1");
        Node n2  = new Node("n2");

        Transition n0_n0  = new Transition(n0, 'B');
        Transition n0_n1  = new Transition(n1, 'A');
        Transition n1_n0  = new Transition(n0, 'A');
        Transition n1_n2  = new Transition(n2, 'B');
        Transition n2_n2  = new Transition(n2, 'A');

        n0.addtransition(n0_n0);
        n0.addtransition(n0_n1);
        n1.addtransition(n1_n0);
        n1.addtransition(n1_n2);
        n2.addtransition(n2_n2);



        FSM own_design = new FSM(n0);

        String s_ =  getInput(); // vb input ABAAA

        System.out.println(own_design.simulateFSM(s_));







    }
}
