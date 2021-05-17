package finite_state_machine;

import org.junit.jupiter.api.BeforeEach;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class FSMTest {
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

    @BeforeEach
    public void init(){
        s0.addtransition(s0_s1);
        s0.addtransition(s0_s2);
        s1.addtransition(s1_s1);
        s1.addtransition(s1_s2);
        s2.addtransition(s2_s3);
        s3.addtransition(s3_s3);
        s3.addtransition(s3_s0);
    }
    @org.junit.jupiter.api.Test
    void simulateFSM() {
        FSM fsm = new FSM(s0);
        ArrayList<String>  expected_output  = new ArrayList<>(Arrays.asList("s0", "s2", "s3", "s3", "s3", "s3", "s0"));
        ArrayList<String> actual = fsm.simulateFSM("ABAAAB");
        assertEquals(expected_output, actual);

    }

    @org.junit.jupiter.api.Test
    void simulateFSM_error() {
        FSM fsm = new FSM(s0);
        ArrayList<String>  expected_output = new ArrayList<>(Arrays.asList("s0", "s2", "Transition does not exist"));
        ArrayList<String> actual = fsm.simulateFSM("AA");
        assertEquals(expected_output, actual);

    }

}