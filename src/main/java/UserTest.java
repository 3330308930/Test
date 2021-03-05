import java.io.PrintStream;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserTest {
    public User Userselect() throws SQLException {

        String id = null;
        String name = null;
        String money = null;
        Connection connection = TestConnectMysql.getConnection();
        Statement statement = null;

        statement = connection.createStatement();


        ResultSet resultSet = statement.executeQuery("select * from t_order where id=1");

        User user = null;
        while (resultSet.next()) {
            int id1 = resultSet.getInt("id");
            String name1 = resultSet.getString("name");
            int money1 = resultSet.getInt("money");
//            System.out.print( "\t" + id1);
//            System.out.print("\t" + name1);
//            System.out.print( "\t" + money1);
            user = new User();
            user.setId(id1);
            user.setName(name1);
            user.setMoney(money1);
            System.out.print(user.toString());


        }


        return user;
    }

    public int updateusermoney(Integer money, Integer price) throws SQLException {
        String sql = "update t_order set money=? where id=1";
        Connection conn = TestConnectMysql.getConnection();
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setInt(1, price);
        int i = statement.executeUpdate();
        statement.close();
        if (i == 1) {
            System.out.print("修改成功");
        }
        return i;


    }
}
