package products;

public class Milk extends product{

    private String name;
    private Integer value;

        public Milk(){
            this.name = "Молоко";
            this.value = 60;
        }


    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Integer getValue() {
        return value;
    }

    @Override
    public void setValue(Integer value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Milk{" +
                "name='" + name + '\'' +
                ", value=" + value +
                '}';
    }
}
