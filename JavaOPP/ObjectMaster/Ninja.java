public class Ninja extends Human{
    int stealth = 10;
    public Ninja(){}
    public void steal(Human obj){
 	obj.health -= this.stealth; 
    }
    public void runAway(){
	this.health -= 10;
    }

}