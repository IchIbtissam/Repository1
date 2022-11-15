package Test;

import metier.Compte;
import metier.CompteSimple;

public class Application {

	public static void main(String[] args) {
		/*
		//creation d'un objet de la classe Compte
		Compte c1 = new Compte(7000);
		Compte c2 = new Compte(6000);
		//c1.verser(6000);
		//c1.retirer(8000);
		System.out.println(c1.toString());
		System.out.println(c2.toString());
		System.out.println("nbrCompte="+Compte.getNbrCompte());
		System.out.println("nbrCompte="+c1.getNbrCompte());
		System.out.println("nbrCompte="+c2.getNbrCompte());
		// Compte.verser() : on ne peut pas acceder directement à cette methode car elle n'est pas static => il faut instantier la classe compte(creer un objet) pour accedre à cette methode
	*/
		//on peut creer un compte simple
		CompteSimple c= new CompteSimple(4000, 500);
		c.verser(5000);
		c.retirer(3000);
		System.out.println(c.toString());
	}

}
