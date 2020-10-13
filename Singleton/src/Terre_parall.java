
public class Terre_parall {
	private int age,id,n,c;
	private static Terre_parall uniqueInstance;// Stockage de l'unique instance de cette classe.

	public Terre_parall() {
		this.age=age;
		this.id=id;
	}
	
    public static synchronized Terre_parall getInstance()
    {
            if(uniqueInstance==null)
            {
                    uniqueInstance = new Terre_parall();
            }
            return uniqueInstance;
    }
  //créer

  		public void creer2(int id,int age,int n) {
  			System.out.println("....creation du client "+ id);
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

  		public void ajouter2(int id,int age,int n) {
  			System.out.println("....ajouter le client "+ id);
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

		public void start() {
			// TODO Auto-generated method stub
			
		}
}
