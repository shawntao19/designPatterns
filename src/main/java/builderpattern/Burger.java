package builderpattern;

/**
 * @Author: xuwentao
 * Created on 2019/10/10 11:03
 */
public abstract class Burger implements Item {

    public Packing packing() {
        return new Wrapper();
    }

    public abstract float price();
}
