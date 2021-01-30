package kata5_is2;

import java.sql.SQLException;
import java.util.List;
import model.Person;


/**
 * @author Pablo
 */
public class Kata5_IS2 {

    
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        
        SQLitePeopleLoader connectionBD = new SQLitePeopleLoader();
        List<Person> lista = connectionBD.load();
        
        for (Person person : lista) {
            System.out.println(person.toString());
        }
    }
    
}
