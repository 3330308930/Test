import com.sun.xml.internal.ws.api.message.MessageWritable;

import java.sql.SQLException;
import java.util.List;

public class Test extends PriceSelect {
    public static void main(String[] args) throws SQLException {

    PriceSelect priceSelect = new PriceSelect();

        UserTest user = new UserTest();
        User userselect = user.Userselect();
        Integer usermoney = userselect.getMoney();
        Price price = priceSelect.PriceList(1);
        System.out.print(price);

        if(usermoney<price.getP_price()){
            System.out.print("余额不足"+"还差"+(usermoney-price.getP_price())+"元");
       }
        if(usermoney>=price.getP_price()){
         Integer  usermoney1 =usermoney- price.getP_price();
            System.out.print(usermoney1);
           int i = user.updateusermoney(usermoney1);
           System.out.print("商品价格"+price.getP_price()+"元\n"+"剩余余额"+usermoney1+"元");


        }



    }
}
