/**
 * membuat tiap-tiap player dgn atribut nama, darah, level, senjata yg digunakan, dan rompi pelindung
 */
public class Player{
    String name;
    double health;
    int level;

    /**
     * deklarasi weapon dari constructor Weapon di class Weapon
     */
    Weapon weapon;
    /**
     * deklarasi armor dari constructor Armor di class Armor
     */
    Armor armor;

    /**
     * contructor untuk membuat fungsi bahwa tiap player akan menampilkan nama dan darah
     */
    public Player(String name, double health){
        this.name = name;
        this.health = health;
    }

    /**
     * @param weapon membuat nama senjata baru
     * @return isi constructor weapon di class weapon
     */
    public void equipWeapon(Weapon weapon){
        this.weapon = weapon;
    }

    /**
     * @param armor membuat nama armor baru
     * @return isi contructor armor di class armor
     */
    public void equipArmor(Armor armor){
        this.armor = armor;
    }

    public void display(){
        System.out.println("\nName : " + this.name);
        System.out.println("Health : " + this.health + " hp");
        this.weapon.display();
        this.armor.display();
    }
}