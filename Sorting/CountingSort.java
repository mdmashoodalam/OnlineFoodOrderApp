public class CountingSort{
	public static void countingSort(int arr[]){
		
		//finding the largest element in give array
		int largest=Integer.MIN_VALUE;
		for (int i =0; i<arr.length; i++){
			largest = Math.max(largest, arr[i]);
		}
		
		//counting the elements in given array
		int count[] = new int[largest+1];
		for (int i=0; i<arr.length; i++){
			count[arr[i]]++;
		}
		
		//Sorting the array according to the given counting
		int j=0;
		for(int i=0; i<count.length; i++){
			while(count[i]>0){
				arr[j]=i;
				j++;
				count[i]--;
				
			}
		}
	}
	
	//printig array
	public static void printArray(int arr[]){
		for(int i=0; i<arr.length; i++){
		System.out.print(arr[i]+" ");
		}
	}
	
	public static void main(String [] args){
	int arr[]={1, 4, 1, 3, 2, 4, 3, 7};
	countingSort(arr);
	printArray(arr);
	}
}