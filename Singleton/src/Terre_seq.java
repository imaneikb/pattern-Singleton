
public class Terre_seq {

	private int c;
	int age,population,id;
	private Terre_seq(int id, int age,int population) {
		this.id=id;
		this.age=age;
		this.population=population;
		

	}


	private static final Terre_seq s;
	static {
		s=new Terre_seq(0,0,0);
	}


	public static Terre_seq getInstance() {
		return s;
	}




	//créer

	public void creer(int id,int age) {
		System.out.println("creation du client "+ id);
		for(int i=1;i<=3;i++) {
			++c;
			System.out.println(".."+c);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("le client  "+id+" a été crée");

	}



	//Ajouter

	public void ajouter(int id,int age) {
		System.out.println("ajouter le client "+ id);
		for(int i=1;i<=3;i++) {
			++c;
			System.out.println(".."+c);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("le client  "+id+" a été ajouté");



	}



	//Afficher

	public void afficher(int id,int age) {
		System.out.println("id du client :  "+ id +"  et son age :"+ age);
	}






}