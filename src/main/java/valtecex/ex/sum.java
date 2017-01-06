package valtecex.ex;


public class sum {

    static int solveMeFirst(int a, int b) {
        // Hint: Type return a+b; below
        return  a + b;
    }

    public static String shortestPalindrome(String s) {
        int i=0;
        int j=s.length()-1;

        while(j>=0){
            if(s.charAt(i)==s.charAt(j)){
                i++;
            }
            j--;
        }

        if(i==s.length())
            return s;

        String suffix = s.substring(i);
        String prefix = new StringBuilder(suffix).reverse().toString();
        String mid = shortestPalindrome(s.substring(0, i));
        String result = prefix+mid+suffix;
        return result;
    }

    public static void main(String[] args) {
        /*Scanner in = new Scanner(System.in);
        int a;
        a = in.nextInt();
        int b;
        b = in.nextInt();
        int sum;
        sum = solveMeFirst(a, b);
        System.out.println(sum);*/
        /*Scanner in = new Scanner(System.in);
        int a;
        a = in.nextInt();
        int b;
        b = in.nextInt();
        int sum;
        sum = solveMeFirst(a, b);
        System.out.println(sum);*/
        String s = "aba";
        int source = s.length();
        String result = shortestPalindrome(s);
        int dest =  result.length();
        System.out.println(dest - source);
    }
}