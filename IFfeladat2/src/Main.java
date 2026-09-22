//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
void main() {
    Scanner sc=new Scanner((System.in));
    System.out.print("Kérek egy egész számot!");
    int height=sc.nextInt();
    if(height>=150 && height<165){
        IO.println("S");
    }
    else if (height>=165 && height<175) {
        IO.println("M");
    }
    else if (height>=175 && height<185) {
        IO.println("L");
    }
    else if (height>=185 && height<195) {
        IO.println("XL");
    }
    else {
        IO.println("NO SIZE");
    }
}
