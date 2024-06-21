import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) throws Exception {

        DFSM dfsm = Has_babb_AsASubstring();
        boolean input = dfsm.compute("");
        System.out.println((input) ? "input is good" : "input is bad");
    }

    public static DFSM DoesntEndWith_ba() throws Exception {
        //setting the alphabet
        ArrayList<Character> a = new ArrayList<>();
        a.add('a');
        a.add('b');
        Alphabet alphabet  = new Alphabet(a);

        //set the states
        IdentifiedState initState = new IdentifiedState(1);
        IdentifiedState State2 = new IdentifiedState(2);
        IdentifiedState State3 = new IdentifiedState(3);
        IdentifiedState State4 = new IdentifiedState(4);
        IdentifiedState Dead = new IdentifiedState(-1);

        Set<State> acceptedStates = new HashSet<>(); // setting the accepting states
        acceptedStates.add(initState);
        acceptedStates.add(State3);

        Set<State> allStates = new HashSet<>(); // setting all the states
        allStates.add(initState);
        allStates.add(State2);
        allStates.add(State3);

        //set the transitions
        Set<Transition> transitions = new TreeSet<Transition>();
        Transition t1 = new Transition(initState, 'a', initState);
        Transition t2 = new Transition(initState, 'b', State3);
        Transition t3 = new Transition(State2, 'a', initState);
        Transition t4 = new Transition(State2, 'b', State3);
        Transition t5 = new Transition(State3, 'a', State2);
        Transition t6 = new Transition(State3, 'b', State3);
        transitions.add(t1);
        transitions.add(t2);
        transitions.add(t3);
        transitions.add(t4);
        transitions.add(t5);
        transitions.add(t6);
        TransitionFunction tf = new TransitionFunction(transitions);

        return new DFSM(allStates, alphabet, tf, initState, acceptedStates);
    }

    public static DFSM Every0FollowedBy_11() throws Exception {
        //setting the alphabet
        ArrayList<Character> a = new ArrayList<>();
        a.add('0');
        a.add('1');
        Alphabet alphabet  = new Alphabet(a);

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

        return new DFSM(allStates, alphabet, tf, initState, acceptedStates);
    }

    public static DFSM Has_babb_AsASubstring() throws Exception {
        //setting the alphabet
        ArrayList<Character> a = new ArrayList<>();
        a.add('a');
        a.add('b');
        Alphabet alphabet  = new Alphabet(a);

        //set the states
        IdentifiedState initState = new IdentifiedState(1);
        IdentifiedState State2 = new IdentifiedState(2);
        IdentifiedState State3 = new IdentifiedState(3);
        IdentifiedState State4 = new IdentifiedState(4);
        IdentifiedState State5 = new IdentifiedState(5);
        IdentifiedState Dead = new IdentifiedState(-1);

        Set<State> acceptedStates = new HashSet<>(); // setting the accepting states
        acceptedStates.add(State5);

        Set<State> allStates = new HashSet<>(); // setting all the states
        allStates.add(initState);
        allStates.add(State2);
        allStates.add(State3);
        allStates.add(State4);
        allStates.add(State5);

        //set the transitions
        Set<Transition> transitions = new TreeSet<Transition>();
        Transition t1 = new Transition(initState, 'a', initState);
        Transition t2 = new Transition(initState, 'b', State2);
        Transition t3 = new Transition(State2, 'a', initState);
        Transition t4 = new Transition(State2, 'b', State3);
        Transition t5 = new Transition(State3, 'a', State4);
        Transition t6 = new Transition(State3, 'b', State3);
        Transition t7 = new Transition(State4, 'a', initState);
        Transition t8 = new Transition(State4, 'b', State5);
        Transition t9 = new Transition(State5, 'a', State5);
        Transition t10 = new Transition(State5, 'b', State5);
        transitions.add(t1);
        transitions.add(t2);
        transitions.add(t3);
        transitions.add(t4);
        transitions.add(t5);
        transitions.add(t6);
        transitions.add(t7);
        transitions.add(t8);
        transitions.add(t9);
        transitions.add(t10);
        TransitionFunction tf = new TransitionFunction(transitions);

        return new DFSM(allStates, alphabet, tf, initState, acceptedStates);
    }

}