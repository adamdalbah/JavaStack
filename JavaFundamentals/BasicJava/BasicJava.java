import java.util.ArrayList;
import java.util.Arrays;
public class BasicJava{
    public void printTo255(){
	for (int i = 1; i < 256; i++){
	    System.out.println(i);
	}
    }
    
    public void printOddTo255(){
	for (int i = 1; i < 256; i+=2){
	    System.out.println(i);
	}
    }

    public void printSum255(){
	int sum = 0;
        for (int i = 0; i < 256; i++){
	    sum += i;
	    System.out.format("New number: %d Sum: %d \n", i, sum);	
	}
     }

    public void printArray(int[] arr){
	for (int i = 0; i < arr.length; i++){
	    System.out.println(arr[i]);
	}
    }

    public void maxElement(int[] arr){
	int max = arr[0];
	for (int i = 0; i < arr.length; i++){
	    if (arr[i] > max){
		max = arr[i];
	    }
	}
	System.out.println(max);
    }

    public void average(int[] arr){
	double avg = 0;
	for (int i = 0; i < arr.length; i++){
	    avg += arr[i];
	}
	avg = avg / arr.length;
	System.out.format("%.2f",avg); 
    }

    public ArrayList<Integer> oddArrayTo255(){
	ArrayList<Integer> y = new ArrayList<Integer>();
	for (int i = 1; i < 256; i += 2){
	    y.add(i);
	}
	return y;
 
    }

    public int greaterThanY(int[] arr, int y){
	int count = 0;
	for(int i = 0; i < arr.length; i++){
	    if (arr[i] > y){
		count++;
	    }
	}
	return count;
    }

    public String multiplyArr(int[] arr){
	for (int i = 0; i < arr.length; i++){
	    arr[i] *= arr[i];
	}
	
	return Arrays.toString(arr);
    }

    public String negativeTo0(int[] arr){	
	for (int i = 0; i < arr.length; i++){
	    if( arr[i] < 0){
		arr[i] = 0;
	    }	    
	}
	return Arrays.toString(arr);  	
    }

    public String minMaxAvg(int[] arr){
	int min=arr[0], max=arr[0], avg = 0;

	for (int i = 0; i < arr.length; i++){
	    avg += arr[i];
	    if ( arr [i] > max){
		max = arr[i];
	    }
	    if ( arr[i] < min){
		min = arr[i];
	    }
	}
	avg /= arr.length;
	int[] array = {min, max, avg};

	return Arrays.toString(array);
    }

    public String shifting(int[] arr){
	for(int i = 0; i < arr.length-1; i++){
            arr[i] = arr[i+1];
	}
	arr[arr.length-1] = 0;
	return Arrays.toString(arr);
	
    }

}