
public class Phone {

    private String name;
    private String number;
    private String model;
    private double weight;

    public Phone () {
        name = "Мария";
        number = ("+79279766896");
        model = ("apple") ;
        weight = (100); }

    public Phone () {
        name = ("Дарья");
        number = ("+79513412257");
        model = ("honor");
        weight = 50;  }

    public Phone() {
        name = ("Алексей");
        number = ("+79513412287");
        model = ("fly");
        weight = 50;  }

    public Phone(String name, String number, String model) {
        this.name = name;
        this.number = number;
        this.model = model; }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public String getModel() {
        return model;
    }

    public double getWeight() {
        return weight;
    }
    public void info(){
        System.out.printf("Phone: Name - model - %s, number - %d, wight - %.2f \n", getName(), getModel(), getNumber(), weight);
    }

    public void receiveCall(String name){
        System.out.printf("Звонок %s ", name);
    }
}
