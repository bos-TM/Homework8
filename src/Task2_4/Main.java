package Task2_4;

public class Main {
    public static void main(String[] args) {
        Device device1 = new Device("Samsung", 1259.99f, "SA23432428DF0");
        Device device2 = new Device("Asus", 2000f, "AS232362342");
        Device device3 = device1;
        System.out.println("Порівняння об'єктів Device:");
        System.out.println(device1.equals(device2));
        System.out.println(device1.equals(device3));
        System.out.println("Хеш-коди об'єктів Device:");
        System.out.println(device1.hashCode());
        System.out.println(device2.hashCode());
        System.out.println(device3.hashCode());
        System.out.println("------------------------");

        Monitor monitor1 = new Monitor(1080, 900);
        Monitor monitor2 = new Monitor(1440, 900);
        Monitor monitor3 = monitor1;
        System.out.println("Порівняння об'єктів Monitor:");
        System.out.println(monitor1.equals(monitor2));
        System.out.println(monitor1.equals(monitor3));
        System.out.println("Хеш-коди об'єктів Monitor:");
        System.out.println(monitor1.hashCode());
        System.out.println(monitor2.hashCode());
        System.out.println(monitor3.hashCode());
        System.out.println("------------------------");

        EthernetAdapter ether1 = new EthernetAdapter(100, "DF8343A3B13");
        EthernetAdapter ether2 = new EthernetAdapter(10, "0B8343A3B94");
        EthernetAdapter ether3 = ether1;
        System.out.println("Порівняння об'єктів EthernetAdapter:");
        System.out.println(ether1.equals(ether2));
        System.out.println(ether1.equals(ether3));
        System.out.println("Хеш-коди об'єктів EthernetAdapter:");
        System.out.println(ether1.hashCode());
        System.out.println(ether2.hashCode());
        System.out.println(ether3.hashCode());
        System.out.println("------------------------");
    }
}
