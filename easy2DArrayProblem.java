class Solution {
	public int maximumWealth(int[][] accounts) {
		int[] sumRow = new int[accounts.length]; //length of 2-D array is the number of rows //creating the a new array that will store the sum of each row
		int returnValue=-1;
		for(int i=0;i<accounts.length;i++){ //calculating the sum of each row and storing in array
			for(int j=0;j<accounts[i].length;j++){
				sumRow[i] += accounts[i][j];
			}
		}	            
		//comparison of corresponding value
		for(int i=0;i+1<sumRow.length;i++){          
			if(sumRow[i]>=sumRow[i+1]){
					if(sumRow[i]>returnValue)
					returnValue=sumRow[i];
			}
			if(sumRow[sumRow.length-1]>returnValue)
				returnValue = sumRow[sumRow.length-1];
		}
		//checked from the exception
		if(sumRow.length==1)
			returnValue = sumRow[0];
		
		return returnValue;
	}
}
