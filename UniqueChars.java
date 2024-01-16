public class UniqueChars {
    public static void main(String[] args) {  
        String str = args[0];
        System.out.println(uniqueChars(str));
    }

    // TODO: you could solve it more easily using str.indexOf(char) method as suggested in the assignment
    public static String uniqueChars(String s) {
        String answer = "";
        answer += s.charAt(0);
        int x = s.length(); // TODO: bad naming of the variable, also you can just write inside the
                            //   the for loop s.length
        for(int i = 1; i < x; i++){
            boolean noDuplicate = true; 
            for(int j = (i-1); (j >= 0) && noDuplicate; j--){ 
                if (s.charAt(i) == ' ') {
                    noDuplicate = true;
                } else if (s.charAt(j) == s.charAt(i)) {
                    noDuplicate = false;
                    // break; TODO: there's no need to continue the loop here
                }
            }
            if (noDuplicate) {
                answer += s.charAt(i);
            }
        }
        return answer;
    }
}
