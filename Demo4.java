public class Demo4{
	public static void main(String[] args){
		int[][] x = {{1,2,3,4},{5,6,7},{8,9,10}};
		int add = 0;
		for(int i=0;i<=x.length;i++){
			for(int j=0; j<= x[i][j].length; j++){
				add = add+x[i][j];
			}
		}
		System.out.println("Addition is :"+ add);
	}
}
