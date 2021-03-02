import java.sql.*;

import java.util.ArrayList;
import java.util.List;

public class PriceSelect {



        public Price PriceList(Integer ids) throws SQLException {

            String id = null;
            String p_name = null;
            String p_price = null;
            Connection connection = TestConnectMysql.getConnection();
            Statement statement = null;

            statement = connection.createStatement();


            ResultSet resultSet = statement.executeQuery("select * from price where id=?");
            ArrayList<Price> arrayList = null;
            Price price = null;
            while (resultSet.next()) {
                int id1 = resultSet.getInt("id");
                String name1 = resultSet.getString("p_name");
                int price1 = resultSet.getInt("p_price");

//            System.out.print( "\t" + id1);
//            System.out.print("\t" + name1);
//            System.out.print( "\t" + money1);
                price = new Price();
                price.setP_id(id1);
                price.setP_name(name1);
                price.setP_price(price1);


            }


            return price;
        }
        public int updatemoney(Integer id,Integer money,Integer price) throws SQLException {
            String sql="update t_order set money=? where id=?";
            Connection conn = TestConnectMysql.getConnection();
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setInt(1,id);
            statement.setInt(2,money);
            int i = statement.executeUpdate();
            statement.close();
            if(i==1){
                System.out.print("修改成功");
            }
            return i;
        }
    }


