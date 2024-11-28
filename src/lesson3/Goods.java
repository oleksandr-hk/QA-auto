package lesson3;

public class Goods {
    private String name;
    private double price;
    private long id;

    public Goods() {
    }

    public Goods(String name, double price, long id) {
        this.name = name;
        this.price = price;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public long getId() {
        return id;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || obj.getClass() != this.getClass()) return false;
        Goods goods = (Goods) obj;
        return this.id == goods.getId();
    }

    @Override
    public int hashCode() {
        return Long.hashCode(id);
    }

    @Override
    public Object clone() {
        try {
            return (Goods) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public String toString() {
        return "Goods{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", id=" + id +
                '}';
    }
}
