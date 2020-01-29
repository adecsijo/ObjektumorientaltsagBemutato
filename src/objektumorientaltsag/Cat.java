package objektumorientaltsag;

/**
 * Objektumorientaltsag
 *
 * @author Nász Nóra
 * @email nasz.nora@gmail.com
 */
public class Cat extends Animal {
    private String breed;

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public String voice() {
        return "Meow";
    }

    public Cat() {}

    public Cat(String breed) {
        this.breed = breed;
    }

    public Cat(String name, String color, int age, double tomeg, boolean male, String breed) {
        super(name, color, age, tomeg, male);
        this.breed = breed;
    }

    //Ha a toString() metódust felüldefiniáljuk, akkor basicCat1-nél és basicCat2-nél is a macska adatait adja vissza,
    //nem pedig a hash kódot.
    /*@Override
    public String toString() {
        return "Cat{" +
                "name='" + super.getName() + '\'' +
                "color='" + super.getColor() + '\'' +
                "age='" + super.getAge() + '\'' +
                "tomeg='" + super.getTomeg() + '\'' +
                "male='" + super.isMale() + '\'' +
                "breed='" + this.breed + '\'' +
                '}';
    }*/

    public String catData() {
        return "Cat{" +
                "name='" + super.getName() + '\'' +
                "color='" + super.getColor() + '\'' +
                "age='" + super.getAge() + '\'' +
                "mass='" + super.getMass() + '\'' +
                "male='" + super.isMale() + '\'' +
                "breed='" + this.breed + '\'' +
                '}';
    }
}
