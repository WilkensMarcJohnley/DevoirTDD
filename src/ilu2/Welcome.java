package ilu2;

public class Welcome {
private static String FRIEND="Hello, my friend";
	
	public static String welcome(String entree){
		entree=usetrim(entree);
		StringBuilder sortie= new StringBuilder();
		if(entree!=null && entree.length()>0) {
			StringBuilder upercase= new StringBuilder();
			StringBuilder lowercase= new StringBuilder();
			diviseString(upercase, lowercase, entree);
			if (lowercase.length()>0) {
				sortie.append(gestionLowerCase(lowercase.toString()));
				if(upercase.length()>0) sortie.append(". AND ");
			}
			if(upercase.length()>0)sortie.append(gestionUperCase(upercase.toString()));
			return sortie.toString();
		}
		return FRIEND;
	}
	
	private static void diviseString(StringBuilder upercase, StringBuilder lowercase, String entree) {
		String[] texte= entree.split(",");
		for(String word: texte) {
			if(verifMAjuscule(word)) {
				upercase.append(word);
				upercase.append(" ");
			}else {
				lowercase.append(word);
				lowercase.append(" ");
			}
		}
	}
	
	private static String gestionLowerCase(String entree){
		StringBuilder str= new StringBuilder();
		str.append("Hello");
		String[] texte= entree.split(" ");
		for(String nom: texte) {
			nom=nom.substring(0, 1).toUpperCase()+nom.substring(1);
			str.append(", ");
			str.append(nom);
		}
		return str.toString();
	}
	
	private static String gestionUperCase(String entree){
		StringBuilder str= new StringBuilder();
		str.append("HELLO");
		String[] texte= entree.split(",");
		for(String nom: texte) {
			nom=nom.substring(0, 1).toUpperCase()+nom.substring(1);
			str.append(", ");
			str.append(nom);
		}
		if(str.length()>0) str.append("!");
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
