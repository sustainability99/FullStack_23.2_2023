public class Cat extends animal{
    String breed; // это поле для породы

    // конструктор
    public Cat(String breed) {
        this.breed = breed;
    }

    public void makeNoise(){
        System.out.println("Мяу - мяу!");
    }

    public void eat() {
        System.out.println("Корм для кошек Kitty Cat");
    }

    public void getDescription(){
        System.out.println("Описание отряда кошачьих...");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "breed='" + breed + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

}
