
public class Loader

{

    public static Cat getKitten(){
        return new Cat (1100);
    }

    @Override
    public String toString() {
        return "Loader{}";
    }

    public static void main(String[] args)
    {
        Cat murka = new Cat();
        Cat barsik = new Cat();
        Cat vasya = new Cat();
        Cat plyushka = new Cat();
        Cat milka = new Cat();
        Cat ryzhik = new Cat();




        System.out.println("murka weight " + murka.getWeight());
        murka.feed(7.0);
        System.out.println("murka new weight " + murka.getWeight());

        System.out.println("barsik weight " + barsik.getWeight());
        barsik.feed(100.0);
        System.out.println("barsik new weight " + barsik.getWeight());

        System.out.println("vasya weight " + vasya.getWeight());
        while (vasya.getWeight() > 1000){
            vasya.meow();
            System.out.println("vasya new weight " + vasya.getWeight());
            System.out.println("vasya " + vasya.getStatus());

    }
        System.out.println("plyushka weight " + plyushka.getWeight());
        while (!plyushka.getStatus().equals("Exploded")){
            plyushka.feed(1000.0);
            System.out.println("plyushka new weight " + plyushka.getWeight());
            System.out.println("plyushka " + plyushka.getStatus());

        }
        System.out.println("milka weight " + milka.getWeight());
        milka.pee();

        System.out.println("ryzhik weight " + ryzhik.getWeight());

        ryzhik.feed(150.0);
        ryzhik.feed(100.0);
        ryzhik.pee();
        ryzhik.pee();
        ryzhik.pee();
        ryzhik.pee();
        System.out.println(ryzhik.getEatenFood());

        Cat cat1 = getKitten();

        System.out.println("cat1 weight " + cat1.getWeight());
        while (!cat1.getStatus().equals("Exploded")){
            cat1.feed(2000.0);
            System.out.println("cat1 new weight " + cat1.getWeight());
            System.out.println("cat1 " + cat1.getStatus());

        }

        Cat cat2 = getKitten();
        Cat cat3 = getKitten();
        Cat cat4 = getKitten();




        
        Cat Kitty = new Cat(1);
        System.out.println(Kitty.getWeight());




        System.out.println(Cat.getCount());

        Cat cat10 = new Cat();
        cat10.setColor("WHITE");
        cat10.setWeight(3500);

        Cat cat11 = new Cat();
        cat11.setColor(cat10.getColor());
        cat11.setWeight(cat10.getWeight());

        System.out.println(cat11.getColor());
        System.out.println(cat11.getWeight());

        Cat cat12 = new Cat();
        cat11.setColor(cat10.getColor());
        cat11.setWeight(cat10.getWeight());

        System.out.println(cat12.getColor());
        System.out.println(cat12.getWeight());

        Cat gato1 =  new Cat("Milashka",4000, "GREY" );
        Cat gato2 = new Cat (gato1);
        Cat gato3 = new Cat (gato1);
        Cat gato4 = new Cat (gato1);

        System.out.println(gato2);
        System.out.println(gato3);
        System.out.println(gato4);

        System.out.println(Cat.getCount());






    }




}