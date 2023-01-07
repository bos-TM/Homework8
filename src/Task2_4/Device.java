package Task2_4;

public class Device {
    String manufacturer;
    float price;
    String serialNumber;

    public Device() {
    }

    public Device(String manufacturer, float price, String serialNumber) {
        this.manufacturer = manufacturer;
        this.price = price;
        this.serialNumber = serialNumber;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    @Override
    public boolean equals(Object parObj) {
        if (parObj == null || parObj.getClass() != this.getClass()) return false;
        if (this == parObj) return true;

        Device objFromPar = (Device)parObj;
        if ((this.manufacturer.equalsIgnoreCase(objFromPar.getManufacturer())) &&
                (this.price == objFromPar.price) &&
                (this.serialNumber.equalsIgnoreCase(objFromPar.getSerialNumber())))
            return true;
        else return false;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((manufacturer == null) ? 0 : manufacturer.hashCode());
        result = prime * result + (int)price;
        result = prime * result + ((serialNumber == null) ? 0 : serialNumber.hashCode());
        return result;
    }
}
