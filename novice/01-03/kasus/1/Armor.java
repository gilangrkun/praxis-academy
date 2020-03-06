/**
 * membuat spesifikasi armor
 */
public class Armor{
    double defencePower;
    String name;

    /**
     * constructor armor
     * @param name nama armor
     * @param defencePower kekuatan armor
     */
    public Armor(String name, double defencePower){
        this.name = name;
        this.defencePower = defencePower;
    }

    public void display(){
        System.out.println("Armor : " + this.name + " , defence : " + this.defencePower);
    }
}