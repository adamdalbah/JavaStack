public class ProjectTest{
    public static void main(String[] args){
	Project laptop = new Project();
	Project machine = new Project("Coca Cola", "produce the best cocacolas with different tasts in seconds");
	Project coffeeMaker = new Project("Dark Coffee");

	System.out.println(machine.getName());

 	coffeeMaker.setDescription("the best arabian coffee");
	System.out.println(coffeeMaker.getDescription());

	laptop.setName("Dell");
	laptop.setDescription("Fastest more comfortable laptop");

	System.out.println(laptop.elevatorPitch());
    }

}