public class Demo3{
	static public void main(String[] args){
		
		int[][] x = new int[3][2];
		
		x[0] = new int[3];
		x[1] = new int[4];
		x[2] = new int[2];
		
		int count =1;
		for(int i = 0;i<x.length;i++){
			for(int j = 0;j<x[i].length;j++){
				System.out.print(x[i][j]+" ");
			}
			System.out.println();
		}
	}
}