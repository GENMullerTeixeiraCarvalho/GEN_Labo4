package ch.heigvd.gen2019;

public class OrdersWriter {
    private Orders orders;

    public OrdersWriter(Orders orders) {
        this.orders = orders;
    }

    public String getContents() {
        StringBuffer sb = new StringBuffer("{\"orders\": [");

        for (int i = 0; i < orders.getOrdersCount(); i++) {
            sb.append(formatOrder(orders.getOrder(i)));
        }

        if (orders.getOrdersCount() > 0) {
            sb.delete(sb.length() - 2, sb.length());
        }

        return sb.append("]}").toString();
    }

    private String formatOrder(Order order) {
        StringBuffer sb = new StringBuffer();
        sb.append("{");
        sb.append(formatField("id", order.getOrderId()));
        sb.append(", ");
        sb.append("\"products\": [");
        for (int j = 0; j < order.getProductsCount(); j++) {
            Product product = order.getProduct(j);

            sb.append("{");
            sb.append(formatField("code", product.getCode()));
            sb.append(", ");
            sb.append(formatField("color", getColorFor(product)));
            sb.append(", ");


            if (product.getSize() != Product.SIZE_NOT_APPLICABLE) {
                sb.append(formatField("size", getSizeFor(product)));
                sb.append(", ");
            }

            sb.append(formatField("price", product.getPrice()));
            sb.append(", ");
            sb.append(formatField("currency", product.getCurrency()));
            sb.append("}, ");
        }

        if (order.getProductsCount() > 0) {
            sb.delete(sb.length() - 2, sb.length());
        }

        sb.append("]");
        sb.append("}, ");
        return sb.toString();
    }

    private String formatField(String nameField, String object) {
        StringBuffer sb = new StringBuffer() ;
        sb.append("\"").append(nameField).append("\": \"");
        sb.append(object);
        sb.append("\"");
        return sb.toString();
    }

    private String formatField(String nameField, Object object) {
        StringBuffer sb = new StringBuffer() ;
        sb.append("\"").append(nameField).append("\": ");
        sb.append(object.toString());
        return sb.toString();
    }

    private String getSizeFor(Product product) {
        switch (product.getSize()) {
            case 1:
                return "XS";
            case 2:
                return "S";
            case 3:
                return "M";
            case 4:
                return "L";
            case 5:
                return "XL";
            case 6:
                return "XXL";
            default:
                return "Invalid Size";
        }
    }

    private String getColorFor(Product product) {
        switch (product.getColor()) {
            case 1:
                return "blue";
            case 2:
                return "red";
            case 3:
                return "yellow";
            default:
                return "no color";
        }
    }
}