package pattern.state.org;

/**
 * @Author: xuwentao
 * Created on 2019/10/12 12:04
 */
public class Context {
    private State state;

    public Context() {
        state = null;
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }
}
