//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
            int intOperandA = 1;
            int intOperandB = 2;
            int intSum = 13;
            int intProduct = 8;
            int intDifference = 3;
            int intQoutient = 4;
            int intModulo = 6;
            double doubleOperandA = 1.2;
            double doubleOperandB = 2.2;
            double doubleSum = 1.3;
            double doubleProduct = 8.1;
            double doubleDifference = 3.5;
            double doubleQoutient = 4.5;
            intSum = intOperandA + intModulo;
            doubleSum = doubleOperandA + doubleDifference;
            System.out.println("The sum of " + intOperandA + " and " + intModulo + " is " +intSum );
            System.out.println("The sum of " + doubleOperandA + " and " + doubleDifference + " is " +doubleSum );
            int favNum = 43;
            System.out.println("My favorite number is " + favNum);
        }
    }

}