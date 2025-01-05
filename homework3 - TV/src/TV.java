public  class TV {
    private Integer dioganal;
    private Integer quality;
    private String colour;
    private String type;
    private String material;


    public TV() {
        this.dioganal = 26;
        this.quality = 1080;
        this.colour = "черный";
        this.type = "настольный";
        this.material = "пластик";

    }
    public TV(Integer dioganal, Integer quality, String colour) {
        this(dioganal, quality, colour, "черный", "пластик");

    }

     public TV(Integer dioganal, Integer quality, String colour, String type, String material) {
        this.dioganal = dioganal;
        this.quality = quality;
        this.colour = colour;;
        this.type = type;
        this.material = material;

    }


    public Integer getDioganal() {
        return dioganal;
    }

    public Integer getQuality() {
        return quality;
    }

    public String getColour() {
        return colour;
    }


    public String getType() {
        return type;
    }

    public String getMaterial() {
        return material;
    }

    public void setDioganal(Integer dioganal) {
        this.dioganal = dioganal;
    }

    public void setQuality(Integer quality) {
        this.quality = quality;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
}