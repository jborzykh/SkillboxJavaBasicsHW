public class Computer {
    public final String vendor;
    public final String name;
    private Processor processor;
    private RAM ram;
    private Storage storage;
    private Display display;
    private Keyboard keyboard;
    private static int totalWeight;

    public Computer(String vendor, String name, Processor processor, RAM ram, Storage storage, Display display, Keyboard keyboard){
        this.vendor = vendor;
        this.name = name;
        this.processor = processor;
        this.ram = ram;
        this.storage = storage;
        this.display = display;
        this.keyboard = keyboard;
        this.totalWeight = getTotalWeight();

    }

    public void setProcessor( Processor processor) {
        this.processor = processor;
    }
    public void setRam(RAM ram) {
        this.ram = ram;
    }

    public void setStorage(Storage storage) {
        this.storage = storage;
    }

    public void setDisplay(Display display) {
        this.display = display;
    }

    public void setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }


    public  Processor getProcessor(){
        return processor;
    }

    public RAM getRam(){
        return ram;
    }
    public Storage getStorage(){
        return storage;
    }
    public Display getDisplay(){
        return display;
    }
    public Keyboard getKeyboard(){
        return keyboard;
    }
    public int getTotalWeight(){
        return processor.getWeight() + ram.getWeight() + storage.getWeight() + display.getWeight() + keyboard.getWeight();
    }

    public String toString(){
        return "Производитель: " + vendor + "\n" +
                "Название: " + name + "\n" +
                "Процессор: " + processor.toString() + "\n" +
                "Память: " + ram.toString() + "\n" +
                "Накопитель информации: " + storage.toString() + "\n" +
                "Дисплей: " + display.toString() + "\n" +
                "Клавиатура: " + keyboard.toString();
    }
}
