package ch.heigvd.gen2019.product;

import ch.heigvd.gen2019.Formattable;

public class Product implements Formattable {
    public static final int SIZE_NOT_APPLICABLE = -1;
    private String code;
    private ProductColor color;
    private ProductSize size;
    private double price;
    private String currency;

    public Product(String code, ProductColor color, ProductSize size, double price, String currency) {
        this.code = code;
        this.color = color;
        this.size = size;
        this.price = price;
        this.currency = currency;
    }

    public String getCode() {
        return code;
    }

    public ProductColor getColor() {
        return color;
    }

    public ProductSize getSize() {
        return size;
    }

    public double getPrice() {
        return price;
    }

    public String getCurrency() {
        return currency;
    }

    public String getFormat(){
        StringBuffer sb = new StringBuffer();
        sb.append("{");
        sb.append(Formattable.formatField("code", this.getCode()));
        sb.append(", ");
        sb.append(Formattable.formatField("color", this.getColor().toString()));
        sb.append(", ");

        if (this.getSize() != ProductSize.NOT_APPLICABLE) {
            sb.append(Formattable.formatField("size", this.getSize().toString()));
            sb.append(", ");
        }

        sb.append(Formattable.formatField("price", this.getPrice()));
        sb.append(", ");
        sb.append(Formattable.formatField("currency", this.getCurrency()));
        sb.append("}, ");
        return sb.toString();
    }
}