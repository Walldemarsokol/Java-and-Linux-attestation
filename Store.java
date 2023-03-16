import java.io.FileWriter;
import java.io.IOException;
import java.util.List;


public class Store {
    private List<Toy>toys;

    public Store(List<Toy> toys){this.toys = toys;}

    public Toy getToyPrice(){
        LotteryRandomToy random = new LotteryRandomToy();
        Toy toy =random.Toyweight(toys);
        return toy;
    }

    public void saveToyLottery(){
        Toy toy = getToyPrice();
        String text = toy.toString();
        try(FileWriter writer = new FileWriter("Win.txt", true)){
          writer.write(text);
          writer.append('\n');
          writer.flush();
        } catch (IOException exception){
            System.out.println(exception.getMessage());
        }
        toys.remove(toy);
    }
}
