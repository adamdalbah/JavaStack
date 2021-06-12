import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class PuzzleJava{
    public ArrayList<Integer> GreaterThan10(int[] arr){
	ArrayList<Integer> newarr = new ArrayList<Integer>();
	int sum = 0;
	for (int i = 0; i < arr.length; i++){
	    sum += arr[i];
	    if(arr[i] > 10){
		newarr.add(arr[i]);
	    }
	}
	System.out.println("The Sum is: " + sum);
	return newarr;
    }

    public ArrayList<String> GreaterThan5Ch(ArrayList<String> arr){
	ArrayList<String> newarr = new ArrayList<String>();
	Collections.shuffle(arr);
	for(int i = 0; i < arr.size(); i++){
	     System.out.println(arr.get(i));
	     if(arr.get(i).length() > 5){
		newarr.add(arr.get(i));
	     }
	}
	return newarr;
    }

    public void alphaVowel(){
	ArrayList<Character> array = new ArrayList<Character>();
	for (char i = 'a'; i >= 'a' && i <='z'; i++){
	    array.add(i);
	}
	Collections.shuffle(array);
	System.out.println("The first element is " + array.get(0) + " And The Last is " + array.get(array.size()-1));
	
	if (array.get(0).equals('a') || array.get(0).equals('i') || array.get(0).equals('o') || array.get(0).equals('u') ||array.get(0).equals('e')){
	    System.out.println("The first element (" +array.get(0)+") is a vowel.");
	}	

    }
    
    public int[] randomArr(){
	int[] arr = new int[10];
	Random r = new Random();
	for (int i = 0; i < arr.length; i++){
 	    arr[i] = 55 + r.nextInt(45);
	}
	return arr;
    }

    public ArrayList<Integer> randomArrSorted(){
	ArrayList<Integer> arr = new ArrayList<Integer>();
	Random r = new Random();
	for (int i = 0; i < 11; i++){
 	    arr.add(55 + r.nextInt(45));
	}
	Collections.sort(arr);
	System.out.println("The minum value is " + arr.get(0) + " and the maximum is " + arr.get(arr.size() -1));
	return arr;
    }

    public String generateWord(){
	Random r = new Random();
	String word = "";
	for (int i = 0; i < 5; i++){
	    word += (char)('a' + r.nextInt(26));
	}
	return word;
    }

    public ArrayList<String> arrayWords(){
	ArrayList<String> words = new ArrayList<String>();
	Random r = new Random();
	for(int i = 0; i < 10; i++){
	    String word = "";
	    for (int j = 0; j < 5; j++){
		word += (char)('a' + r.nextInt(26));
	    }
	    words.add(word);
	}
	return words;
    }


}