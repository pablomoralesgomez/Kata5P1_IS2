package kata5_is2;

import model.Person;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Pablo
 */
public interface PeopleLoader {
    
    /**
     *
     * @return
     * @throws ClassNotFoundException
     * @throws SQLException
     */
    public List<Person> load()  throws ClassNotFoundException, SQLException ;
}
