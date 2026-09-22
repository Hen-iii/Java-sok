//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
void main() {

    Scanner sc=new Scanner((System.in));
    System.out.print("Kérek egy egész számot!");
    int egyik=sc.nextInt();
    System.out.print("Kérek egy másik egész számot!");
    int masik=sc.nextInt();
    if(egyik==masik){
        IO.println("A két szám egyenlő!");
    }
    else if (egyik>masik) {
        IO.println("Az első szám nagyobb, mint a második");
    }
    else {
        IO.println("A második szám nagyobb, mint az első");

    }

}
