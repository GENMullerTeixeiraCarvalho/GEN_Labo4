package ch.heigvd.gen2019;

public interface Formattable {
    static String formatField(String nameField, String object) {
        StringBuffer sb = new StringBuffer() ;
        sb.append("\"").append(nameField).append("\": \"");
        sb.append(object);
        sb.append("\"");
        return sb.toString();
    }

    static String formatField(String nameField, Object object) {
        StringBuffer sb = new StringBuffer() ;
        sb.append("\"").append(nameField).append("\": ");
        sb.append(object.toString());
        return sb.toString();
    }

    String getFormat();
}
