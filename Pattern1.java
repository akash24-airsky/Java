public class Pattern1{
	public static void main(String[] args){
	     for(int line = 1;line<=5;line++){
			 for(int space =5;space>=line;space--){
				 System.out.println(" ");
			 }
			 for(int i=1;i<=line;i++){
				 if(line%2!=0){
					 System.out.print(line+" ");
				 }
			 } 
			 for(char c ='a';c<='d';c++){
				 if(line%2==0){
					 System.out.print(c+" ");
				 }
			 }
			 System.out.println();
		 }
	}
}