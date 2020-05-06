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
        StringBuffer sb = new StringBuffer("{\"orders\": [");

        for (int i = 0; i < this.getOrdersCount(); i++) {
            sb.append(this.getOrder(i).getFormat());
        }

        if (this.getOrdersCount() > 0) {
            sb.delete(sb.length() - 2, sb.length());
        }

        return sb.append("]}").toString();
    }
}
