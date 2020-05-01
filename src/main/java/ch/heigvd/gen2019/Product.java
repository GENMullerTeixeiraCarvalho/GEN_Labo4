package ch.heigvd.gen2019;

public class Product {
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
}