/**
 * membuat spesifikasi senjata
 */
public class Weapon{
    double attackPower;
    String name;

    /**
     * contructor weapon
     * @param name nama senjata
     * @param attackPower kekuatan senjata
     */
    public Weapon(String name, double attackPower){
        this.name = name;
        this.attackPower = attackPower;
    }

    public void display(){
        System.out.println("Weapon : " + this.name + " , attack : " + this.attackPower);
    }
}