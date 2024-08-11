
/**
 * Write a description of WordPlay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WordPlay {
    boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ) {
            return true;
        } else {
            return false;
        }
    }
    
    void testIsVowel() {
        System.out.println("F is " + isVowel('F'));
        System.out.println("a is " + isVowel('a'));
    }
    
    String replaceVowels(String phrase, char ch) {
        StringBuilder sb = new StringBuilder(phrase);
        for (int i = 0; i < phrase.length(); i++) {
            if (isVowel(sb.charAt(i))) {
                sb.setCharAt(i, ch);
            }
            
        }
        return sb.toString();
    }
    
    void testReplaceVowels() {
        System.out.println(replaceVowels("Hello World", '*'));
    }
    
    String emphasize(String phrase, char ch) {
        StringBuilder sb = new StringBuilder(phrase);
        for (int i = 0; i < phrase.length(); i++) {
            if (isVowel(sb.charAt(i)) ) {
                if(i % 2 == 0 ) {
                    sb.setCharAt(i, '*');
                } else {
                    sb.setCharAt(i, '+');
                }
            }
            
        }
        return sb.toString(); 
    }
    
    void testEmphasize() {
        System.out.println(emphasize("dna ctgaaactga", 'a'));
        System.out.println(emphasize("Mary Bella Abracadabra", 'a'));
    }

}
