public class Samurai extends Human{
    int health = 200;
    static int numberOfSamurai = 0;
    public Samurai(){
	numberOfSamurai++;
    }
    public void deathBlow(Human obj){
	obj.health = 0;
	this.health -= 100;
    }
    public void meditate(){
	this.health += (this.health / 2);
    }
    public static int howMany(){
	return numberOfSamurai;
    }
}