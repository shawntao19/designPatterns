package pattern.filter;

/**
 * @Author: xuwentao
 * Created on 2019/10/10 14:35
 */
import java.util.List;

public interface Criteria {
    public List<Person> meetCriteria(List<Person> persons);
}
