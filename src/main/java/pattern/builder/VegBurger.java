package pattern.builder;

/**
 * @Author: xuwentao
 * Created on 2019/10/10 11:04
 */
public class VegBurger extends Burger {

    @Override
    public float price() {
        return 25.0f;
    }

    public String name() {
        return "Veg Burger";
    }
}
