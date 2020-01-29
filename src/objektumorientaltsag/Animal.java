package objektumorientaltsag;

/**
 * Objektumorientaltsag
 *
 * @author Nász Nóra
 * @email nasz.nora@gmail.com
 */
public class Animal {

    private String name;
    private String color;
    private int age;
    private double tomeg;
    private boolean male;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getTomeg() {
        return tomeg;
    }

    public void setTomeg(double tomeg) {
        this.tomeg = tomeg;
    }

    public boolean isMale() {
        return male;
    }

    public void setMale(boolean male) {
        this.male = male;
    }

    public Animal() {}

    public Animal(String name, String color, int age, double tomeg, boolean male) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.tomeg = tomeg;
        this.male = male;
    }

    public String voice() {
        return "Grrrr";
    }
}
