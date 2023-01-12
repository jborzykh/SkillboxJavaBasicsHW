public class Processor {

    //Процессор:
    //частота,
    //количество ядер,
    //производитель,
    //вес.


    public int frequency;
    public final int coreAmount;
    public final String manufacturer;
    public final int weight;

    public Processor(int frequency, int coreAmount, String manufacturer, int weight){
        this.frequency = frequency;
        this.coreAmount = coreAmount;
        this.manufacturer = manufacturer;
        this.weight = weight;
    }
    public int getFrequency() {
        return frequency;
    }

    public int getCoreAmount() {
        return coreAmount;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getWeight() {
        return weight;
    }

    public String toString(){
        return "Частота: " + frequency + " " +
                "Количество ядер: " + coreAmount + " " +
                "Производитель: " + manufacturer + " " +
                "Вес: " + weight;
    }



}
