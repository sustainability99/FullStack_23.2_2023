public abstract class animal {
    String name;

    // метод для звуков
    public void makeNoise(){
    }

    // метод для еды
    public void eat() {
    }

    // метод выводит описание
    public void getDescription(){
    }

    // сеттер имени (собака, кошка или медведь)
    public animal(String name) {
        this.name = name;
    }
}