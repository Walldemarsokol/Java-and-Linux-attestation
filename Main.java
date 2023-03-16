import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Toy toy1 = new Toy(1,"Плюшевый Мишка",6);
        Toy toy2 = new Toy(2,"Робот",2);
        Toy toy3 = new Toy(3,"Машинка",1);
        Toy toy4 = new Toy(4,"Юла",0.5);
        Toy toy5 = new Toy(5,"Плюшевый заяц",3.5);

        List<Toy> toys = new ArrayList<Toy>();
        toys.add(toy2);
        toys.add(toy1);
        toys.add(toy4);
        toys.add(toy5);
        toys.add(toy3);

        Store toystore = new Store(toys);
        toystore.saveToyLottery();
        toystore.saveToyLottery();
        toystore.saveToyLottery();

    }
}
