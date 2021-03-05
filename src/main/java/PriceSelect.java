import java.sql.*;

import java.util.ArrayList;
import java.util.List;

public class PriceSelect extends UserTest {


    public Price PriceList(Integer id1) throws SQLException {

        String id = null;
        String p_name = null;
        String p_price = null;
        Connection connection = TestConnectMysql.getConnection();
        Statement statement = null;

        statement = connection.createStatement();


        ResultSet resultSet = statement.executeQuery("select * from price where id=1");
        ArrayList<Price> arrayList = null;
        Price price = null;
        while (resultSet.next()) {
            int id2 = resultSet.getInt("id");
            String name1 = resultSet.getString("p_name");
            int price1 = resultSet.getInt("p_price");

//            System.out.print( "\t" + id1);
//            System.out.print("\t" + name1);
//            System.out.print( "\t" + money1);
            price = new Price();
            price.setP_id(id2);
            price.setP_name(name1);
            price.setP_price(price1);


        }


        return price;
    }
}
//        public int updatemoney(Integer p_price,Integer id) throws SQLException {
//            String sql="update price set p_price=? where id=?";
//            Connection conn = TestConnectMysql.getConnection();
//            PreparedStatement statement = conn.prepareStatement(sql);
//            statement.setInt(1,p_price);
//            statement.setInt(2,id);
//            int i = statement.executeUpdate();
//            statement.close();
//            if(i==1){
//                System.out.print("修改成功");
//            }
//            return i;
//        }
//    }


