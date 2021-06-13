public class IPhone extends Phone implements Ringable{
    public IPhone(String versionNumber, int batteryPercentage, String carrier, String ringTone){
	super(versionNumber, batteryPercentage, carrier, ringTone);
    }
    
    @Override
    public String ring(){
	return String.format("Iphone %s Says %s", this.getVerisonNumber(), this.getRingTone());
    }

    @Override
    public String unlock(){
	return "Unlocking via facial recognition";
    }

    @Override
    public void displayInfo(){
	System.out.format("iPhone %s from %s\n", this.getVerisonNumber(), this.getCarrier());
    }
}