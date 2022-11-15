package metier;
//cette classe ne peux pas etre executer car il ne contient pas la methode main => ce n'est pas une application
//cette classe est abstraite => on ne peux pas l'instanti� et elle n'a aucune signification que lorsqu'on cre� des classes deriv�s de cette classe
public abstract class Compte implements ICompte{
	//les attribut
	private int code; //private : pour ne etre accessible par les classes du meme package
	protected float solde; //protected : il est accessible par les classes du meme package
	//c'est un attribut static => sa valeur est partag� entre les objets(instances) de la classe
	private static int nbrCompte=0;
	
	public Compte() {}
	public Compte(float solde) {
		++nbrCompte;
		code=nbrCompte;
		this.solde = solde;
	}
	//les methodes
	public abstract void afficher(); //c'est une methode qu'on est oblig� de la redifir dans les classes deriv�es
	//c'est une methode final : on ne peut pas la redifinir dans les classes deriv�es
	@Override
	public final void verser(float montant) {
		solde= solde+montant;
	}
	@Override
	public void retirer(float montant) {
		solde= solde-montant;
	}

	public String toString() {
		return("code="+code+" "+"solde="+solde);
	}
	
	//getters
	//on a creer que les getters pour qu'on puisse changer les valeurs du code , nbrcompte et solde seulement on utilisant les methodes verser() et retirer() 
	public int getCode() {
		return code;
	}
	@Override
	public float getSolde() {
		return solde;
	}
	//c'est une methode static = > on peut l'appeler directement � partir de la classe ou � partir d'un objet de la classe
	public static int getNbrCompte() {
		return nbrCompte;
	}
}
