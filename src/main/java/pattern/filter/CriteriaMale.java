package pattern.filter;

/**
 * @Author: xuwentao
 * Created on 2019/10/10 14:35
 */
import java.util.ArrayList;
import java.util.List;

public class CriteriaMale implements Criteria {

    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> malePersons = new ArrayList<Person>();
        for (Person person : persons) {
            if(person.getGender().equalsIgnoreCase("MALE")){
                malePersons.add(person);
            }
        }
        return malePersons;
    }
}
