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
  Scanner sc=new Scanner((System.in));
  System.out.print("Kérem az első egész számot!");
    int egyik=sc.nextInt();
    System.out.print("Kérem a második egész számot!");
    int masik=sc.nextInt();
    System.out.print("Kérem a harmadik egész számot!");
    int harm=sc.nextInt();
    if(egyik>masik && egyik>harm){
        IO.println("A három szám közül a legnagyobb: "+egyik);
        if(masik>harm){
            IO.println("A három szám közül a középső: "+masik);
            IO.println("A három szám közül a legkisebb: "+harm);
        }
        else{
            IO.println("A három szám közül a középső: "+harm);
            IO.println("A három szám közül a legkisebb: "+masik);
        }
    }
    else  if(egyik<masik && masik>harm){
        IO.println("A három szám közül a legnagyobb: "+masik);
        if(egyik>harm){
            IO.println("A három szám közül a középső: "+egyik);
            IO.println("A három szám közül a legkisebb: "+harm);
        }
        else{
            IO.println("A három szám közül a középső: "+harm);
            IO.println("A három szám közül a legkisebb: "+egyik);
        }
    }
    else{
        IO.println("A három szám közül a legnagyobb: "+harm);

        if(egyik>masik){
            IO.println("A három szám közül a középső: "+egyik);
            IO.println("A három szám közül a legkisebb: "+masik);
        }
        else{
            IO.println("A három szám közül a középső: "+masik);
            IO.println("A három szám közül a legkisebb: "+egyik);
        }
    }


}
