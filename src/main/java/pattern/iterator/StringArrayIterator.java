package pattern.iterator;

/**
 * @Author: xuwentao
 * Created on 2019/10/12 10:13
 */
public class StringArrayIterator implements Iterator {
    String[] args;
    int index = 0;

    public StringArrayIterator(String[] argTemp) {
        this.args = argTemp;
    }

    public boolean hasNext() {
        if (index < args.length) {
            return true;
        }
        return false;
    }

    public Object next() {
        if (index < args.length) {
            return args[index++];
        }
        return null;
    }
}
