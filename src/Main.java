import javax.swing.*;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) throws Exception {
        //set the states
        IdentifiedState initState = new IdentifiedState(1);
        IdentifiedState State2 = new IdentifiedState(2);
        IdentifiedState State3 = new IdentifiedState(3);
        IdentifiedState Dead = new IdentifiedState(-1);

        Set<State> acceptedStates = new HashSet<>(); // setting the accepting states
        acceptedStates.add(initState);

        Set<State> allStates = new HashSet<>(); // setting all the states
        allStates.add(initState);
        allStates.add(State2);
        allStates.add(State3);
        allStates.add(Dead);

        //set the transitions
        Set<Transition> transitions = new TreeSet<Transition>();
        Transition t1 = new Transition(initState, '0', State2);
        Transition t2 = new Transition(State2, '1', State3);
        Transition t3 = new Transition(State3, '1', initState);
        Transition t4 = new Transition(initState, '1', initState);
        Transition t5 = new Transition(State2, '0', Dead);
        Transition t6 = new Transition(State3, '0', Dead);
        Transition t7 = new Transition(Dead, '1', Dead);
        Transition t8 = new Transition(Dead, '0', Dead);
        transitions.add(t1);
        transitions.add(t2);
        transitions.add(t3);
        transitions.add(t4);
        transitions.add(t5);
        transitions.add(t6);
        transitions.add(t7);
        transitions.add(t8);
        TransitionFunction tf = new TransitionFunction(transitions);

        //setting the alphabet
        ArrayList<Character> a = new ArrayList<>();
        a.add('0');
        a.add('1');
        Alphabet alphabet  = new Alphabet(a);

        DFSM dfsm = new DFSM(allStates, alphabet, tf, initState, acceptedStates);
        boolean input = dfsm.compute("111101101101111111011");
        System.out.println((input) ? "input is good" : "input is bad");
    }
}