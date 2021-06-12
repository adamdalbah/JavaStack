public class HumanTest{
    public static void main(String[] args){
	Human attacker = new Human();
	Human prey = new Human();
	attacker.attack(prey);
	System.out.println(prey.health);

	Ninja aninja = new Ninja();
	aninja.runAway();
	aninja.steal(prey);
	System.out.println(prey.health);
	System.out.println(aninja.health);

	Samurai sam = new Samurai();
	Samurai Reta = new Samurai();
	System.out.println(Samurai.howMany());

	Wizard wiz = new Wizard();
	wiz.fireball(prey);
	System.out.println(prey.health);
    }
}