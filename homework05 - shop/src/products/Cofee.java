package products;

public class Cofee extends product {
    private String name;
    private Integer value;

    public Cofee(){
        this.name = "Растворимый кофе";
        this.value = 1000;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = "Растворимый кофе";
    }

    @Override
    public Integer getValue() {
        return value;
    }

    @Override
    public void setValue(Integer value) {
        this.value = 1000;
    }


}
