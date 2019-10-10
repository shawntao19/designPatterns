package pattern.filter;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: xuwentao
 * Created on 2019/10/10 14:36
 */
public class CriteriaSingle implements Criteria {

    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> singlePersons = new ArrayList<Person>();
        for (Person person : persons) {
            if(person.getMaritalStatus().equalsIgnoreCase("SINGLE")){
                singlePersons.add(person);
            }
        }
        return singlePersons;
    }
}
