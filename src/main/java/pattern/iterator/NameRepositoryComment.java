package pattern.iterator;

/**
 * @Author: xuwentao
 * Created on 2019/10/12 10:10
 */
public class NameRepositoryComment implements Container {
    public String names[] = {"Robert", "John", "Julie", "Lora"};

    public Iterator getIterator() {
        return new StringArrayIterator(names);
    }
}
