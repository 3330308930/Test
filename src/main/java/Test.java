import com.sun.xml.internal.ws.api.message.MessageWritable;

import java.sql.SQLException;
import java.util.List;

public class Test extends PriceSelect {
    public static void main(String[] args) throws SQLException {
//        PriceSelect select = new PriceSelect();
//        List<Price> prices = select.PriceList();
        Testselect testselect = new Testselect();
        testselect.Userselect();


    }
}
