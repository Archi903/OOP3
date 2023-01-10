package DZ;

public abstract class Transport{

    private String brand;
    private String model;
    private final int productionYear;
    private final String productionCountry;
    private String color;
    private int maxSpeed;

    private static final String DEFAULT_VALUE = "default";
    private static final int DEFAULT_YEAR = 2000;
    private static final String DEFAULT_COLOR = "белый";
    private static final int DEFAULT_SPEED = 2000;

    public Transport(String brand, String model, int productionYear, String productionCountry, String color, int maxSpeed) {
        setBrand(brand);
        setModel(model);
        if (productionYear <= 0) {
            this.productionYear = DEFAULT_YEAR;
        } else {
            this.productionYear = productionYear;
        };
        if (productionCountry == null || productionCountry.isEmpty() || productionCountry.isBlank()) {
            this.productionCountry = DEFAULT_VALUE;
        } else {
            this.productionCountry = productionCountry;
        };
        setColor(color);
        setMaxSpeed(maxSpeed);
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public final int getProductionYear() {
        return productionYear;
    }

    public final String getProductionCountry() {
        return productionCountry;
    }

    public String getColor() {
        return color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setBrand(String brand) {
        if (brand == null || brand.isEmpty() || brand.isBlank()) {
            this.brand = DEFAULT_VALUE;
        } else {
            this.brand = brand;
        }
    }

    public void setModel(String model) {
        if (model == null || model.isEmpty() || model.isBlank()) {
            this.model = DEFAULT_VALUE;
        } else {
            this.model = model;
        }
    }

    public void setColor(String color) {
        if (color == null || color.isEmpty() || color.isBlank()) {
            this.color = DEFAULT_COLOR;
        } else {
            this.color = color;
        }
    }

    public void setMaxSpeed(int maxSpeed) {
        if (maxSpeed <= 0) {
            this.maxSpeed = DEFAULT_SPEED;
        } else {
            this.maxSpeed = maxSpeed;
        }
    }

    @Override
    public String toString() {
        return "бренд = " + brand +
                ", модель = " + model +
                ", год производства = " + productionYear +
                ", страна производства = " + productionCountry +
                ", цвет = " + color +
                ", максимальная скорость = " + maxSpeed;
    }
}
