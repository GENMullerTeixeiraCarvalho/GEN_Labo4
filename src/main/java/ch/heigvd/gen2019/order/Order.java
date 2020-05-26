package ch.heigvd.gen2019.order;

import ch.heigvd.gen2019.Formattable;
import ch.heigvd.gen2019.product.Product;

import java.util.ArrayList;
import java.util.List;

public class Order implements Formattable {
    private List<Product> products = new ArrayList<Product>();
    private int id;

    public Order(int id) {
        this.id = id;
    }

    public void AddProduct(Product product) {
        products.add(product);
    }

    public String getFormat(){
        StringBuffer sb = new StringBuffer();
        sb.append("{");
        sb.append(Formattable.formatField("id", id));
        sb.append(", ");
        sb.append("\"products\": ");
        sb.append(Formattable.formatList(products));
        sb.append("}, ");
        return sb.toString();
    }
}
