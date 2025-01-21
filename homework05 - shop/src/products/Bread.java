package products;

public class Bread extends product{

    private String name;
    private Integer value;

        public Bread(){
            this.name = "Хлеб";
            this.value = 40;
        }


    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = "Хлеб";
    }

    @Override
    public Integer getValue() {
        return value;
    }

    @Override
    public void setValue(Integer value) {
        this.value = 40;
    }

}
