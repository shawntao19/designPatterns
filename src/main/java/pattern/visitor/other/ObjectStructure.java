package pattern.visitor.other;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Author: xuwentao
 * Created on 2019/10/14 10:01
 */
//对象结构角色
public class ObjectStructure {
    private List<Element> list = new ArrayList<Element>();

    public void accept(Visitor visitor) {
        Iterator<Element> i = list.iterator();
        while (i.hasNext()) {
            ((Element) i.next()).accept(visitor);
        }
    }

    public void add(Element element) {
        list.add(element);
    }

    public void remove(Element element) {
        list.remove(element);
    }
}
