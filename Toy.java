public class Toy {

    int Toyid;
    String nameToy;
    double weight;

    public Toy(int id, String name, double weight) {
        this.Toyid = id;
        this.nameToy = name;
        this.weight = weight;
    }

    public void  setWeight(float weight){
        this.weight = weight;
    }
    public double getWeight(){
        return  weight;
    }
    @Override
    public String toString(){
        return "Toy [id=" + Toyid + ", name=" + nameToy + ", weight=" + weight + "]";
    }

}
