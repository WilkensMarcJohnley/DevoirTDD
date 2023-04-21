package ilu2;

public class Welcome {
private static String BOB="Hello, Bob";
private static String FRIEND="Hello, my friend";
	
	public static String welcome(String entree){
		entree=usetrim(entree);
		if(entree!=null && (entree.trim()).length()>0) {
		return BOB;
		}
		return FRIEND;
	}
	
	private static String usetrim(String entree) {
		if(entree!=null) return entree.trim();
		return null;
	}

}
