
public class Cesar {
	private int clef;
	
	public Cesar(int clef) {	
		this.clef = clef % 26;
	}
	public Cesar() {
		this.clef = 0;
	}
	
	private char transfo(char c, int clef) {
		return (char) ((c - 'A' + clef) % 26 + 'A');
	}
	public char code(char c) {
		if('A' <= c && c <= 'Z') {
			return transfo(c,this.clef);
		}
		return c;
	}
	
	public char decode(char c) {
		if('A' <= c && c <= 'Z') {
			if( c - 'A' - clef < 0) {
				return (char) (26 + (c - 'A' - clef) + 'A');
			}
			return transfo(c, this.clef*(-1));
		}
		return c;
	}
	
	public String code(String s) {
		String res =""; 
		for(int i =0; i < s.length(); i++) {
			res += code(s.charAt(i));
		}
		return res; 
	}
	
	public String decode(String s) {
		String res =""; 
		for(int i =0; i < s.length(); i++) {
			res += decode(s.charAt(i));
		}
		return res; 
	}
}
