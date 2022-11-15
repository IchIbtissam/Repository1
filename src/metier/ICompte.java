package metier;
//L'interface c'est la premiere chose qu'on crée
public interface ICompte {

	public void verser(float montant);
	public void retirer(float montant) ;
	public float getSolde();
}
