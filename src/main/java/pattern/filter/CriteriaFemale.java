package pattern.filter;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: xuwentao
 * Created on 2019/10/10 14:36
 */
public class CriteriaFemale implements Criteria {

    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> femalePersons = new ArrayList<Person>();
        for (Person person : persons) {
            if(person.getGender().equalsIgnoreCase("FEMALE")){
                femalePersons.add(person);
            }
        }
        return femalePersons;
    }
}