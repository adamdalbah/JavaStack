public class HumanTest{
    public static void main(String[] args){
	Human attacker = new Human();
	Human prey = new Human();
	attacker.attack(prey);
	System.out.println(prey.health);
    }
}