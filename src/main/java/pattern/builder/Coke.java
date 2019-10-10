package pattern.builder;

/**
 * @Author: xuwentao
 * Created on 2019/10/10 11:05
 */
public class Coke extends ColdDrink {

    @Override
    public float price() {
        return 30.0f;
    }

    public String name() {
        return "Coke";
    }
}