package flipkart;

public class Product 
{
    private String name;
    private String description;
    private double price;
    private String dimensions;
    private double weight;
    private String displaySize;
    private String cameraResolution;
    private String storageCapacity;

    public Product(String name, String description, double price, String dimensions, double weight,
                   String displaySize, String cameraResolution, String storageCapacity) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.dimensions = dimensions;
        this.weight = weight;
        this.displaySize = displaySize;
        this.cameraResolution = cameraResolution;
        this.storageCapacity = storageCapacity;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public String getDimensions() {
        return dimensions;
    }

    public void setDimensions(String dimensions) {
        this.dimensions = dimensions;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getDisplaySize() {
        return displaySize;
    }

    public void setDisplaySize(String displaySize) {
        this.displaySize = displaySize;
    }

    public String getCameraResolution() {
        return cameraResolution;
    }

    public void setCameraResolution(String cameraResolution) {
        this.cameraResolution = cameraResolution;
    }

    public String getStorageCapacity() {
        return storageCapacity;
    }

    public void setStorageCapacity(String storageCapacity) {
        this.storageCapacity = storageCapacity;
    }
}
