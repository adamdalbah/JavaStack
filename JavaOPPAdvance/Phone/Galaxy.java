public class Galaxy extends Phone implements Ringable{
    public Galaxy(String versionNumber, int batteryPercentage, String carrier, String ringTone){
	super(versionNumber, batteryPercentage, carrier, ringTone);
    }

    @Override
    public String ring(){
	return String.format("Galaxy %s Says %s", this.getVerisonNumber(), this.getRingTone());
    }

    @Override
    public String unlock(){
	return "Unlocking via fingerprint";
    }

    @Override
    public void displayInfo(){
	System.out.format("Galaxy %s from %s\n", this.getVerisonNumber(), this.getCarrier());
    }

}