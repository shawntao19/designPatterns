package pattern.builder;

/**
 * @Author: xuwentao
 * Created on 2019/10/10 11:05
 */
public class ChickenBurger extends Burger {

    @Override
    public float price() {
        return 50.5f;
    }

    public String name() {
        return "Chicken Burger";
    }
}
