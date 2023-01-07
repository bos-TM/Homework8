package Task5;

public class Animal {
    String name;
    int age;
    boolean tail;

    public Animal() {
    }

    public Animal(String name, int age, boolean tail) {
        this.name = name;
        this.age = age;
        this.tail = tail;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isTail() {
        return tail;
    }

    public void setTail(boolean tail) {
        this.tail = tail;
    }

    @Override
    public String toString() {
        return "Ім'я: " + name + ", вік: " + age + ", хвіст: " + tail;
    }

    @Override
    public boolean equals(Object parObj) {
        if (parObj == null || parObj.getClass() != this.getClass()) return false;
        if (this == parObj) return true;

        Animal objFromPar = (Animal) parObj;
        if ((this.name.equalsIgnoreCase(objFromPar.getName())) &&
                (this.age == objFromPar.age) &&
                (this.tail == objFromPar.tail))
            return true;
        else return false;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + age;
        result = prime * result + ((tail) ? 1 : 0);
        return result;
    }

    public static void main(String[] args) {
        Animal cat = new Animal("Vasia", 7, true);
        Animal dog = new Animal("Sharik", 5, false);
        System.out.println(cat.equals(dog));

        System.out.println(cat);
        System.out.print("Хеш-код: ");
        System.out.println(cat.hashCode());
        System.out.println(dog);
        System.out.print("Хеш-код: ");
        System.out.println(dog.hashCode());
    }
}
