
public class Cat {
    private double originWeight;
    private double weight;

    public double eatenFood;
    public static int count;
    private Color color;
    private String name;





    public Cat()
    {
        weight = 1500.0 + 3000.0 * Math.random();
        originWeight = weight;
        count++;


    }

    public Cat(double weight) {
        this();
        this.weight = weight;
        if (!isAlive()) {
            count--;

        }
    }

    public Cat (String name, double weight, Color color){
        this.name = name;
        this.weight=weight;
        this.color = color;
        if (isAlive()) {
            count++;

        }

    }

    public Cat (Cat gato){
        this(gato.getName(),gato.getWeight(), gato.getColor());
        if (!isAlive()) {
            count--;

        }
    }



    public static final int EYES_COUNT = 2;

    public static final double MIN_WEIGHT = 1000;

    public static final double MAX_WEIGHT = 9000;


    public static int getCount(){
        return count;
    }


    public void setColor (Color color){
        this.color=color;
    }

    public Color getColor (){
       return color;
    }


    public void meow()
    {   if (isAlive())
        addWeight(-1.0);
        System.out.println("Meow");
    }

    public void pee()
    { if (isAlive())
        addWeight(-100.0);
        System.out.println("pysspyss");
    }


    private void setEatenFood (double eatenFood){
        this.eatenFood = eatenFood;
    }
    private void addEatenFood (double eatenFood){
        setEatenFood(getEatenFood()+eatenFood);
    }

    public Double getEatenFood() {
        return eatenFood;
    }
    public void feed(Double amount)
    {    if (isAlive())
        addWeight(amount);
        addEatenFood (amount);

    }


    public void drink(Double amount)
    {
        addWeight(amount);
    }

    void setWeight(double weight){
        if (isAlive()){
            this.weight = weight;
            if (!isAlive()) {
                count--;
            }
        }
    }

    private void addWeight (Double weight){
        setWeight(getWeight() + weight);
    }


    public Double getWeight()
    {
        return weight;
    }

    public String getName()
    {
        return name;
    }

    public void setName (String name){
        this.name=name;
    }



    public String getStatus()

    {
        if(weight < MIN_WEIGHT) {
            return "Dead";

        }
        else if(weight > MAX_WEIGHT) {
            return "Exploded";
        }
        else if(weight > originWeight) {
            return "Sleeping";
        }
        else {
            return "Playing";
        }
    }

    public boolean isAlive (){
        return getWeight() >= MIN_WEIGHT && getWeight() <= MAX_WEIGHT;
    }




    @Override
    public String toString() {
        return "Cat{" +
                "weight=" + weight +
                ",  color='" + color + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}