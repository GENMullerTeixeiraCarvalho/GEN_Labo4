package ch.heigvd.gen2019.order;

import java.util.ArrayList;
import ch.heigvd.gen2019.Formattable;
import java.util.List;

public class Orders implements Formattable {
    private List<Order> orders = new ArrayList<Order>();

    public void AddOrder(Order order) {
        orders.add(order);
    }

    public int getOrdersCount() {
        return orders.size();
    }

    public Order getOrder(int i) {
        return orders.get(i);
    }

    public String getContents(){
        return this.getFormat();
    }

    public String getFormat(){
        StringBuffer sb = new StringBuffer("{\"orders\": ");

        sb.append(Formattable.formatList(orders));

        return sb.append("}").toString();
    }
}
