package products;

public class IceCream extends product{
    private String name;
    private Integer value;

    public IceCream(){
        this.name = "Мороженое";
        this.value = 200;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = "Мороженое";
    }

    @Override
    public Integer getValue() {
        return value;
    }

    @Override
    public void setValue(Integer value) {
        this.value = 200;
    }

}

