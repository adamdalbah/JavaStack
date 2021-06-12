public class StartManipulatorTest{
    public static void main(String[] args){
	StartManipulator test = new StartManipulator();
	System.out.println(test.trimAndConcat("    Hello     ","     World    "));  
	System.out.println(test.getIndexOrNull("Hello", 'l'));
	System.out.println(test.getIndexOrNull("Hello", "ello"));
	System.out.println(test.concatSubstring("Hello", 1, 2, "world"));
    }
}