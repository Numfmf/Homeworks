package products;

public class Cake extends product{

    private String name;
    private Integer value;

        public Cake(){
            this.name = "Торт";
            this.value = 1000;
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
        this.value = 1000;
    }

}
