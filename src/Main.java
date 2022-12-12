import com.dao.UserDao510;
import com.bean.User510;
import java.sql.SQLException;
public class Main {
    public static void main(String[] args) throws SQLException {
        System.out.println("Hello world!");
        User510 user510;
        user510 = new UserDao510().find( 23333);
        System.out.println(user510.getUser_name());
    }
}