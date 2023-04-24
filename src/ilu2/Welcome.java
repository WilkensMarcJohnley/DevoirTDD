package ilu2;

public class Welcome {
private static String FRIEND="Hello, my friend";
	
	public static String welcome(String entree){
		entree=usetrim(entree);
		if(entree!=null && (entree.trim()).length()>0) {
			if(verifMAjuscule(entree))return "HELLO, "+ entree+" !";
			entree=entree.substring(0, 1).toUpperCase()+entree.substring(1);
			return "Hello, " +entree;
		}
		return FRIEND;
	}
	
	private static String usetrim(String entree) {
		if(entree!=null) return entree.trim();
		return null;
	}
	
	private static boolean verifMAjuscule(String entree) {
		return entree.equals(entree.toUpperCase());
	}
}
