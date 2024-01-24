package introducao;

import java.util.Locale;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Locale.setDefault(Locale.US);
        System.out.println("Hello and welcome!");
        double x = 10.35784;
        System.out.printf("%.2f%n", x);
        System.out.printf("%.4f%n", x);

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }

        String name = "Maria";
        int age = 31;
        double salary = 4000.0;
        System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", name, age, salary);

    }
}