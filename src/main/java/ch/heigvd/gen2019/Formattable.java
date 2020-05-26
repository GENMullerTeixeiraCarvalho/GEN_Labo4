package ch.heigvd.gen2019;

import java.util.List;

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

    static String formatList(List<? extends Formattable> list){
        StringBuffer sb = new StringBuffer("[");
        for (Formattable formattable : list) {
            sb.append(formattable.getFormat());
        }

        if (list.size() > 0) {
            sb.delete(sb.length() - 2, sb.length());
        }

        sb.append("]");
        return sb.toString();
    }

    String getFormat();
}
