package builderpattern;

/**
 * @Author: xuwentao
 * Created on 2019/10/10 11:06
 */
public class Pepsi extends ColdDrink {

    @Override
    public float price() {
        return 35.0f;
    }

    public String name() {
        return "Pepsi";
    }
}