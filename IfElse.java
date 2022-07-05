public class IfElse{
	public static void main(String[] args){
		
		for(char i = 1;i<= 5;i++){ //row
			for( char j =1;j<=i;j++){ // coloumn
				System.out.print( "* ");
			}
			
			System.out.println();
		}
	}
}                            // *
                             // * * 
							 // * * *
							 // * * * * 
							 // * * * * *