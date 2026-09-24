//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
void main() {
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    IO.println(String.format("Hello and welcome!"));

    for (int i = 1; i <= 5; i++) {
        //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
        // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
        IO.println("i = " + i);
    }
    //1
    Scanner sc=new Scanner((System.in));
    System.out.print("Kérek egy 1 és 5 közötti egész számot!");
    int szam=sc.nextInt();
    switch (szam){
        case 1:IO.println("Elégtelen");break;
        case 2:IO.println("Elégséges");break;
        case 3:IO.println("Közepes");break;
        case 4:IO.println("Jó");break;
        case 5:IO.println("Jeles");break;
        default: IO.println("Nincs ilyen jegy");break;

    }

}
