//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
void main() {

    Scanner sc=new Scanner((System.in));
    System.out.print("Kérek egy szöget!");
    int szog=sc.nextInt();
    if(szog>360){
        szog=szog%360;
    }

    switch (szog){
        case 0: IO.println("null szög");break;
        case 90: IO.println("derékszög");break;
        case 180: IO.println("egyenes szög");break;
        case 360: IO.println("teljes szög");break;
    }
    if(szog>0 && szog<90){
        IO.println("Hegyes szög");
    }
    else if(szog>90 && szog<180){
        IO.println("Tompa szög");
    }
    else if(szog>180 && szog<360){
        IO.println("Homorú szög");
    }
    }
