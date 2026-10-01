//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
void main() {
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.

    Scanner sc=new Scanner((System.in));
    System.out.print("Adja meg hány adatot kíván megadni!");
    int hossz=sc.nextInt();
    int[] egesz=new int[hossz];
    for(int i=0;i<hossz;i++){
        System.out.print("Kérem a(z) "+i+". tagot!");
        egesz[i]=sc.nextInt();
    }
    IO.println("A tömb tagjai: ");
    for(int i=0;i<hossz;i++){
        IO.println(egesz[i]);
    }
}
