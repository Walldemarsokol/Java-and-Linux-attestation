import java.util.List;

public class LotteryRandomToy {

    public Toy Toyweight(List<Toy>toys) {
        double weightToy = 0.0;
        for (Toy toy :toys)
            weightToy +=toy.getWeight();
        double t = Math.random() * weightToy;
        double countWeight = 0.0;
        for (Toy toy : toys) {
            countWeight += toy.getWeight();
            if (countWeight >= t)
                return toy;
        }
        throw new RuntimeException();
    }

}
