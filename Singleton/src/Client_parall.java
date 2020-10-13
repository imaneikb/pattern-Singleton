import java.util.Scanner;
public class Client_parall {
	public static void main(String[] args) {
		int v=1;
		Scanner clientt = new Scanner(System.in);
		while(v==1){
			int id = clientt.nextInt();
		    int age = clientt.nextInt();		

			Terre_parall b=new Terre_parall(); 
        	b.start();
		}

}

}
