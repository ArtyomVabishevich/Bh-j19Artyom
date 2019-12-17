package by.belhard.j19.lessons.lessons4;

public class Main {
    public static void main(String[] args) {
        Country brazil = new Country();
        brazil.name = "Brazil";
        brazil.zipCode = 123456;

        Person Alfred = new Person();

        Person alfredo = new Person();
        alfredo.name = "Alfredo";
        alfredo.age = 21;
        alfredo.country = brazil;
        alfredo.sex = Sex.Male;

        Person Tereza = new Person();
        tereza.name = "Tereza";
        tereza.country = "Brazil";
        tereza.age = "21";
    }
}
