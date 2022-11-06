class Solution {
	    public int maximumWealth(int[][] accounts) {
		            int[] sumRow = new int[accounts.length];
			            int returnValue=-1;

				            for(int i=0;i<accounts.length;i++){
						                for(int j=0;j<accounts[i].length;j++){
									                sumRow[i] += accounts[i][j];
											            }
								        }
					            
					            for(int i=0;i+1<sumRow.length;i++){          
							                if(sumRow[i]>=sumRow[i+1]){
										                if(sumRow[i]>returnValue)
													                    returnValue=sumRow[i];
												            }
									            if(sumRow[sumRow.length-1]>returnValue)
											                    returnValue = sumRow[sumRow.length-1];
										            }
						            if(sumRow.length==1)
								                returnValue = sumRow[0];

							            return returnValue;
								        }
}
