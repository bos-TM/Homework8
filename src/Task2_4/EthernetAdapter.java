package Task2_4;

public class EthernetAdapter extends Device{
    int speed;
    String mac;

    public EthernetAdapter() {
    }

    public EthernetAdapter(int speed, String mac) {
        this.speed = speed;
        this.mac = mac;
    }

    public EthernetAdapter(String manufacturer, float price, String serialNumber, int speed, String mac) {
        super(manufacturer, price, serialNumber);
        this.speed = speed;
        this.mac = mac;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    @Override
    public String toString() {
        return ("Device: manufacturer = " + manufacturer + ", price = " + price + ", serialNumber = " + serialNumber +
                ", speed = " + speed + ", mac = " + mac);
    }

    @Override
    public boolean equals(Object parObj) {
        if (parObj == null || parObj.getClass() != this.getClass()) return false;
        if (this == parObj) return true;

        EthernetAdapter objFromPar = (EthernetAdapter)parObj;
        if ((this.mac.equalsIgnoreCase(objFromPar.getMac())) &&
                (this.speed == objFromPar.speed) )
            return true;
        else return false;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((mac == null) ? 0 : mac.hashCode());
        result = prime * result + speed;
        return result;
    }
}
