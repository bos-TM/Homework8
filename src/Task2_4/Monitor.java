package Task2_4;

public class Monitor extends Device{
    int resolutionX;
    int resolutionY;

    public Monitor() {
    }

    public Monitor(int resolutionX, int resolutionY) {
        this.resolutionX = resolutionX;
        this.resolutionY = resolutionY;
    }

    public Monitor(String manufacturer, float price, String serialNumber, int resolutionX, int resolutionY) {
        super(manufacturer, price, serialNumber);
        this.resolutionX = resolutionX;
        this.resolutionY = resolutionY;
    }

    public int getResolutionX() {
        return resolutionX;
    }

    public void setResolutionX(int resolutionX) {
        this.resolutionX = resolutionX;
    }

    public int getResolutionY() {
        return resolutionY;
    }

    public void setResolutionY(int resolutionY) {
        this.resolutionY = resolutionY;
    }

    @Override
    public String toString() {
        return ("Device: manufacturer = " + manufacturer +
                ", price = " +  price +
                ", serialNumber = " + serialNumber +
                ", X = " + resolutionX +
                ", Y = " + resolutionY);
    }

    @Override
    public boolean equals(Object parObj) {
        if (parObj == null || parObj.getClass() != this.getClass()) return false;
        if (this == parObj) return true;

        Monitor objFromPar = (Monitor)parObj;
        if ((this.resolutionX == objFromPar.resolutionX) &&
                (this.resolutionY == objFromPar.resolutionY))
            return true;
        else return false;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + resolutionX;
        result = prime * result + resolutionY;
        return result;
    }
}
