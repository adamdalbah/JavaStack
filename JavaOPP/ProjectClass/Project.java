public class Project{
    private String name;
    private String desc;
    private double initialCost;

    public Project(){}
    public Project(String name){
	this.name = name;
    }
    public Project(String name, String desc){
	this.name = name;
	this.desc = desc;
    }

    public String elevatorPitch(){
	String pitch = String.format("%s (%.2f) : %s", name, initialCost, desc);
	return pitch;
    }

    public void setName(String name){
	this.name = name;
    }
    public void setDescription(String desc){
	this.desc = desc;
    }
    public void setInitialCost(double cost){
	initialCost = cost;
    }

    public String getName(){
	return name;
    }
    public String getDescription(){
	return desc;
    }
    public double getInitialCost(){
	return initialCost;
    }	

  
}