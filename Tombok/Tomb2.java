import java.util.Scanner;
void  main(){
    Scanner sc=new Scanner((System.in));
    System.out.print("Adja meg hány adatot kíván megadni!");
    int hossz=sc.nextInt();
    double[] tizedes=new double[hossz];
    for(int i=0;i<hossz;i++){
        System.out.print("Kérem a(z) "+i+". tagot!");
        tizedes[i]=sc.nextDouble();
    }
    IO.println("A tömb tagjai: ");
    for(int i=0;i<hossz;i++){
        IO.println(tizedes[i]);
    }
}
