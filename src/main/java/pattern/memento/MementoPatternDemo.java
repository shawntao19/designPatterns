package pattern.memento;

/**
 * @Author: xuwentao
 * Created on 2019/10/12 11:06
 */
public class MementoPatternDemo {
    public static void main(String[] args) {
        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();
        originator.setState("State #1");
        originator.setState("State #2");
        careTaker.add(originator.saveStateToMemento());
        originator.setState("State #3");
        careTaker.add(originator.saveStateToMemento());
        originator.setState("State #4");

        System.out.println("当前状态 Current State: " + originator.getState());
        originator.getStateFromMemento(careTaker.get(0));
        System.out.println("存档一 First saved State: " + originator.getState());
        originator.getStateFromMemento(careTaker.get(1));
        System.out.println("存档二 Second saved State: " + originator.getState());
    }
}
