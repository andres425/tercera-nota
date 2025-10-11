package arraylist.model;

public class Product {
    public String name;
    public String code;
    public double price;

    public Product(String name, String code, double price){
        this.name=name;
        this.code=code;
        this.price=price;
    }

    public String getCode(){
        return code;
    }

    public String toString(){
        return name +""+ " el codigo es "+ code +  "el precio es "+ price;
    }
}
