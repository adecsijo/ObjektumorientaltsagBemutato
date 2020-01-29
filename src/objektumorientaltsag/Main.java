package objektumorientaltsag;

/**
 * Objektumorientaltsag
 *
 * @author Nász Nóra
 * @email nasz.nora@gmail.com
 */
public class Main {
    public static void main(String[] args) {
        Cat basicCat1 = new Cat();
        Cat basicCat2 = new Cat();
        Cat catWithBreed = new Cat("British shorthair");
        Cat specialCat = new Cat("Gizmo", "tabby", 9, 4, true, "British shorthair");
//        Cat animal = new Animal(); //Mivel az animal nem terjeszti ki a Cat-et ez hibás.
        Animal catAnimal = new Cat(); //Mivel a Cat kiterjeszti az Animal-t, tehát a Cat egyben Animal is ez jó.
        Animal animal = new Animal(); //Mivel a Cat kiterjeszti az Animal-t, tehát a Cat egyben Animal is ez jó.
        String basicCatMeow = basicCat1.voice();
        String catAnimalMeow = catAnimal.voice();
        String animalMeow = animal.voice();
        System.out.println("basicCatMeow " + basicCatMeow);
        System.out.println("catAnimalMeow " + catAnimalMeow);
        System.out.println("animalMeow " + animalMeow);
        /* A toString() függvény az Object-től származik. Implementációja:
         * public String toString() {
         *     return this.getClass().getName() + "@" + Integer.toHexString(this.hashCode());
         * }
         * A @ jel utáni karaktersor az objektum hash kódja,
         * ami azonos objektumok esetén megegyezik, különböző objektumok esetén nem.
         */
        System.out.println("basicCat1 " + basicCat1.toString());
        System.out.println("basicCat2 " + basicCat2.toString());
        System.out.println("basicCat1 " + basicCat1.catData());
        System.out.println("basicCat2 " + basicCat2.catData());
        System.out.println("catWithBreed" + catWithBreed.catData());
        System.out.println("specialCat" + specialCat.catData());
        basicCat1.setName("Hógolyó");
        basicCat2.setColor("Füst");
        System.out.println("basicCat1 updated " + basicCat1.catData());
        System.out.println("basicCat2 updated " + basicCat2.catData());
    }
}
