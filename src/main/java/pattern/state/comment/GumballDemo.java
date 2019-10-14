package pattern.state.comment;

/**
 * @Author: xuwentao
 * Created on 2019/10/12 14:00
 */
public class GumballDemo {

    public static void main(String[] args) {
        NoPatternGumballMachine noPatternGumballMachine = new NoPatternGumballMachine(0);
        noPatternGumballMachine.insertQuarter();
        noPatternGumballMachine.turnCrank();
        noPatternGumballMachine.ejectQuarter();
        noPatternGumballMachine.dispense();

//        System.out.println("==========加入设计模式========");
//        GumballMachine gumballMachine = new GumballMachine(10);
//        gumballMachine.insertQuarter();
//        gumballMachine.turnCrank();
//        gumballMachine.ejectQuarter();
//        gumballMachine.dispense();

        System.out.println("==========加入设计模式========");
        GumballMachine gumballMachine = new GumballMachine(10);
//        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.ejectQuarter();
        gumballMachine.dispense();
    }
}
