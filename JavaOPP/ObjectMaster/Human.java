public class Human{
   int strength = 3;
   int stealth = 3;
   int intelligence = 3;
   int health = 100;
   public Human(){}
   
   public void attack(Human obj){
	obj.health -= this.strength;
   } 

}