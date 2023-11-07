package Arrays;

public class Check_Symmetric_ornot {

	public static void main(String[] args) {
		int[][] symmetric_arr = { {1,2}, {2,1}, {3,4}, {4,5}, {5,4} };
		int len1 = symmetric_arr.length;
		int len2 = symmetric_arr[0].length;
		for(int i = 0; i < len1 - 1; i++) {
			for(int j = 1; j < len1; j++) {
					if(symmetric_arr[i][0] == symmetric_arr[j][1] && symmetric_arr[i][1] == symmetric_arr[j][0]) {
						System.out.println(symmetric_arr[j][0] + " " + symmetric_arr[j][1]);
				}
			}
			
		}
	}

}
