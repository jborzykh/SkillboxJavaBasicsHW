public class Keyboard {
    //Клавиатура:
    //тип,
    //наличие подсветки,
    //вес.

    public final int type;
    public final String lights;
    public final int weight;

    public Keyboard(int type, String lights, int weight){

        this.type = type;
        this.lights = lights;
        this.weight = weight;
    }
    public int getType() {
        return type;
    }
    public String getLights() {
        return lights;
    }

    public int getWeight() {
        return weight;
    }

    public String toString(){
        return "Тип: " + type + " " +
                "Подсветка: " + lights + " " +
                "Вес: " + weight;
    }

}
