package metier;
//c'est une classe final : on ne peux pas heriter cette classe
public final class CompteSimple extends Compte{

	private float decouvert;
	private final float taux = 2; //c'est une variable final : on ne peux pas changer sa valeur
	
	public CompteSimple(float solde, float decouvert) {
		super(solde);
		this.decouvert=decouvert;
	}

	//redifinition de la methode retirer()
	//L'annotation @Override : signifie que cette methode est une nouvelle version de l'ancienne methode 
	@Override
	public void retirer(float montant) {
		
		if(montant<solde+decouvert) solde -= montant; 
	}
	
	@Override
	public void afficher() {
		System.out.println("C'est un compte simple");
	}
}
