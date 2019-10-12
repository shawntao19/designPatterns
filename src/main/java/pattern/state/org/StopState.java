package pattern.state.org;

/**
 * @Author: xuwentao
 * Created on 2019/10/12 12:04
 */
public class StopState implements State {

    public void doAction(Context context) {
        System.out.println("Player is in stop state");
        context.setState(this);
    }

    @Override
    public String toString() {
        return "Stop State";
    }
}
