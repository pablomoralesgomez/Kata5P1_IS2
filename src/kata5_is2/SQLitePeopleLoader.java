
package kata5_is2;

import model.Person;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Pablo
 */
public class SQLitePeopleLoader implements PeopleLoader{

    /**
     *
     * @return
     * @throws ClassNotFoundException
     * @throws SQLException
     */
    @Override
    public List<Person> load() throws ClassNotFoundException, SQLException {
        List<Person> lista = new ArrayList<>();
        
         Class.forName("org.sqlite.JDBC");
        Connection connection = DriverManager.getConnection(
                "jdbc:sqlite:data/prueba.db");
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(
                "SELECT * FROM people");
        while(resultSet.next()) {
            Person person = new Person(resultSet.getString("first_name"),
                    resultSet.getString("last_name"), 
                    resultSet.getString("company_name"), 
                    resultSet.getString("address"), resultSet.getString("city"),
                    resultSet.getString("county"), resultSet.getString("state"),
                    Integer.parseInt(resultSet.getString("zip")), 
                    resultSet.getString("phone1"), resultSet.getString("phone2"), 
                    resultSet.getString("email"), resultSet.getString("web"));
            lista.add(person);
        }
        statement.close();
        
        return lista;
    }
    /*String email = resultSet.getString("email");
            System.out.println(email);*/
}
