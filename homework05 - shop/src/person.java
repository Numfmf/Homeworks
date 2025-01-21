import products.product;

import java.util.Arrays;

public class person {
    private String name;
    private Integer money;
    private product[] cart = new product[5];
    public int index = 0;

    void addProductToCart(product product) {
        if (this.money >= product.getValue()) {
            this.cart[index] = product;
        } else {
            System.out.println("Пользователь не может себе позволить " + product.getName());
        }
    }


    @Override
    public String toString() {
        return "person{" +
                "name='" + name + '\'' +
                ", money=" + money +
                ", cart=" + Arrays.toString(cart) +
                '}';
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    public person() {
        super();
    }

    public void setName(String name) {

        if (name.isEmpty()) {
            System.out.println("Имя пользователя не может быть пустым");
        } else {
            this.name = name;
        }
    }

    public Integer getMoney() {
        return money;

    }

    public void setMoney(Integer money) {
        if (money < 0) {
            System.out.println("Количетсво денег не должно быть меньше нуля");
        } else {
            this.money = money;
        }
    }


}
