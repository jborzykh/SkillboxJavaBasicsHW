public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer("intel", "icore",
        new Processor(123, 3,"abc", 600),
        new RAM("a", 500, 100),
        new Storage("hdd", 500, 200),
        new Display(100, "b", 100),
        new Keyboard(300, "hasLights", 200));
        System.out.println(computer.toString());
        System.out.println("Общий вес: " + computer.getTotalWeight());


    }
}
