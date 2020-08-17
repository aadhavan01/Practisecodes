package pkg;

public class AscendingDescending {

	public static void main(String[] args) {
		
		int temp;
		
		
	int	[]arr  = new  int [] {20,4,56,67};
	
	for(int i= 0;i<arr.length;i++) {
		
		for(int j=i+1;j<arr.length; j++) {
			
			if(arr[i]>arr[j]) {
				
				temp = arr[i];
				
				arr[i]=arr[j];
				arr [j]=temp;
				
			}
			
		}
		
		
	}
	
	for(int k = 0;k<arr.length;k++) {
		
		System.out.print(arr[k]+", ");
	}
		

	}

}
