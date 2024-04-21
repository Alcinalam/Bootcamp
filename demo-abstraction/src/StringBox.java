public class StringBox implements CharSequence {
    
    private char[] characters;

    public StringBox(String str) {
        this.characters = new char [str.length()];
        for (int i = 0; i < str.length(); i++) {
            this.characters[i] = str.charAt(i);
        }
    }
    @Override
    public int length() {
        return this.characters.length;
    }

    @Override
    public char charAt(int index) {
        return this.characters[index];
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        StringBuilder sb = new StringBuilder();
        for (int i = start; i < end ; i++) {
            sb.append(this.characters[i]);
        }
        return sb;
    }

    public static void main (String[] args) {
        CharSequence cs  = new StringBox("hello");
        System.out.println(cs.charAt(1)); // e

        CharSequence cs2 = new String("hello");
        
    }
}
