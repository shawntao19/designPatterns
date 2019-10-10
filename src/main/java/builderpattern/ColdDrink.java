package builderpattern;

/**
 * @Author: xuwentao
 * Created on 2019/10/10 11:03
 */
public abstract class ColdDrink implements Item {

    public Packing packing() {
        return new Bottle();
    }

    public abstract float price();
}
