//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String letters = "ABC \t abc \r\n 123!";
        System.out.println(letters);
        for(char c : letters.toCharArray()){
            int i = (int) c;
            System.out.print("'" + c + "'");
            System.out.print("=");
            System.out.print((int) c);
            System.out.print("\n") ;

        }
    }
}