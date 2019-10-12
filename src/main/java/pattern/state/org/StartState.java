package pattern.state.org;

/**
 * @Author: xuwentao
 * Created on 2019/10/12 12:03
 */
public class StartState implements State {

    public void doAction(Context context) {
        System.out.println("Player is in start state");
        context.setState(this);
    }

    @Override
    public String toString() {
        return "Start State";
    }
}
