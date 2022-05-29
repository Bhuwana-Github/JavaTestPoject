package practiseProgram;
import java.io.BufferedReader;
import java.io.InputStreamReader;
 
public class Rem_duplicates {
	//Java Program to Remove Duplicates in a Sorted Array
 	// Function to remove the duplicates
	 static int removeDuplicates(int[] array){
	        int replaceIndex = 0;
	        int i,j;
	        for(i=0; i<array.length; i++){
	            for(j=i+1; j<array.length; j++){
	                if(array[j]!=array[i]){
	                    break;
	                }
	            }
	            array[replaceIndex++] = array[i];
	            System.out.println("i="+i+"j="+j);
	            i = j-1;
	            System.out.println("i2="+i+"j2="+j);
	        }
	        return replaceIndex;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		        int size;
		        System.out.println("Enter the size of the array");
		        try {
		            size = Integer.parseInt(br.readLine());
		        } catch (Exception e) {
		            System.out.println("Invalid Input");
		            return;
		        }
		        int[] array = new int[size];
		        System.out.println("Enter array elements in sorted order");
		        int i;
		        for (i = 0; i < array.length; i++) {
		            try {
		                array[i] = Integer.parseInt(br.readLine());
		            } catch (Exception e) {
		                System.out.println("An error occurred");
		                return;
		            }
		        }
		        int index = removeDuplicates(array);
		        System.out.println("Array after removing duplicates is");
		        for(i=0; i<index; i++){
		            System.out.print(array[i] + " ");
		        }
		    }

	}


