package ch.heigvd.gen2019.product;

import ch.heigvd.gen2019.Currency;
import ch.heigvd.gen2019.Formattable;

public class Product implements Formattable {
    private String code;
    private ProductColor color;
    private ProductSize size;
    private double price;
    private Currency currency;

    public Product(String code, ProductColor color, ProductSize size, double price, Currency currency) {
        this.code = code;
        this.color = color;
        this.size = size;
        this.price = price;
        this.currency = currency;
    }

    public String getFormat(){
        StringBuffer sb = new StringBuffer();
        sb.append("{");
        sb.append(Formattable.formatField("code", code));
        sb.append(", ");
        sb.append(Formattable.formatField("color", color.toString()));
        sb.append(", ");

        if (size != ProductSize.NOT_APPLICABLE) {
            sb.append(Formattable.formatField("size", size.toString()));
            sb.append(", ");
        }

        sb.append(Formattable.formatField("price", price));
        sb.append(", ");
        sb.append(Formattable.formatField("currency", currency.toString()));
        sb.append("}, ");
        return sb.toString();
    }
}