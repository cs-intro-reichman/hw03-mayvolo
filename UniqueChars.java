public class UniqueChars {
    public static void main(String[] args) {  
        String str = args[0];
        System.out.println(uniqueChars(str));
    }

    public static String uniqueChars(String s) {
        String answer = "";
        answer += s.charAt(0);
        int x = s.length(); 
        for(int i = 1; i < x; i++){
            boolean noDuplicate = true; 
            for(int j = (i-1); (j >= 0) && noDuplicate; j--){ 
                if (s.charAt(i) == ' ') {
                    noDuplicate = true;
                } else if (s.charAt(j) == s.charAt(i)) {
                    noDuplicate = false;
                }
            }
            if (noDuplicate) {
                answer += s.charAt(i);
            }
        }
        return answer;
        //return null;
    }
}
