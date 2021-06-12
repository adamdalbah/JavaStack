public class Wizard extends Human{
    int health = 50;
    int intelligence = 8;

    public Wizard(){}

    public void heal(Human obj){
	obj.health += this.intelligence;
    }
    public void fireball(Human obj){
	obj.health -= (this.intelligence * 3);
    }
	
}