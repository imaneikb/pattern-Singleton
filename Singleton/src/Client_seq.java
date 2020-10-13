import java.util.Scanner; 
public class Client_seq {
	public static void main(String[] args) {
		int w=1;
		Scanner client = new Scanner(System.in);

		while(w==1){
			int id = client.nextInt();
		    int age = client.nextInt();		

			Terre_seq b=Terre_seq.getInstance();
			b.creer(id,age);

			Terre_seq d=Terre_seq.getInstance();
			d.ajouter(id,age);

			Terre_seq a=Terre_seq.getInstance();
			a.afficher(id,age);

		}




	}
}
