package ilu2;

public class Welcome {
private static String FRIEND="Hello, my friend";
	
	public static String welcome(String entree){
		entree=usetrim(entree);
		if(entree!=null && entree.length()>0) {
			if(verifMAjuscule(entree))return "HELLO, "+ entree+" !";
			entree=gestionLowerCase(entree);
			return entree;
		}
		return FRIEND;
	}
	
	private static String gestionLowerCase(String entree) {
		StringBuilder str= new StringBuilder();
		str.append("Hello");
		String[] texte= entree.split(",");
		for(String nom: texte) {
			nom=nom.substring(0, 1).toUpperCase()+nom.substring(1);
			str.append(", ");
			str.append(nom);
		}
		return str.toString();
	}
	
	private static String usetrim(String entree) {
		if(entree!=null) return entree.trim();
		return null;
	}
	
	private static boolean verifMAjuscule(String entree) {
		return entree.equals(entree.toUpperCase());
	}
}
