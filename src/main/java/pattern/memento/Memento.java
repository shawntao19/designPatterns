package pattern.memento;

/**
 * @Author: xuwentao
 * Created on 2019/10/12 11:04
 */
public class Memento {
    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}