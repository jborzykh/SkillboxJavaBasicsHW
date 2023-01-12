public class Storage {
    //Накопитель информации:
    //тип — HDD, SSD,
    //объём памяти,
    //вес.


    public final String diskType;
    public final int ramVolume;
    public final int weight;

    public Storage(String diskType, int ramVolume, int weight){
        this.diskType = diskType;
        this.ramVolume = ramVolume;
        this.weight = weight;
    }

    public String getDiskType() {
        return diskType;
    }
    public int getRamVolume() {
        return ramVolume;
    }

    public int getWeight() {
        return weight;
    }
    public String toString(){
        return "Тип: " + diskType + " " +
                "Объем: " + ramVolume + " " +
                "Вес: " + weight;
    }



}
