package ch.heigvd.gen2019;

public enum ProductColor {
    NONE("no color"), BLUE("blue"), RED("red"), YELLOW("yellow");
    private String name;
    ProductColor(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
