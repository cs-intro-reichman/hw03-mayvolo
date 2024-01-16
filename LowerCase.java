public class LowerCase {
    public static void main(String[] args) {  
        String str = args[0];
        System.out.println(lowerCase(str));
    }

    public static String lowerCase(String s) {
        String answer = "";
        for(int i=0; i<s.length(); i++) {
            if((s.charAt(i) >= 65) && (s.charAt(i) <= 90)){
                int asci = s.charAt(i);
                asci += 32;
                char charResult = (char) asci;
                answer += charResult;
            } else {
                answer += s.charAt(i);
            }
        }
        return answer;
    }

    // TODO: see my version of the solution. It's more readable and more maintable
    public static String lowerCaseMyVersion(String s) {
        String answer = "";
        for(int i=0; i<s.length(); i++) {
            char currChar = s.charAt(i);
            if (isLowerCase(currChar))
                answer += currChar;
            else
                answer += toLowerCase(currChar);
        }
        return answer;
    }
    private static char toLowerCase(char c){
        int asci = c;
        asci += 32;
        return (char) asci;
    }
    private static boolean isLowerCase(char c){
        return (c >= 65) && (c <= 90);
    }
}
