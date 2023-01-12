public class RAM {
    //Оперативная память:
    //тип,
    //объём,
    //вес.


    public final String type;
    public final int volume;
    public final int weight;

    public RAM(String type, int volume, int weight){
        this.type = type;
        this.volume = volume;
        this.weight = weight;
    }
    public String getType() {
        return type;
    }
    public int getVolume() {
        return volume;
    }
    public int getWeight() {
        return weight;
    }
    public String toString(){
        return "Тип: " + type + " " +
                "Объем: " + volume + " " +
                "Вес: " + weight;
    }


}
