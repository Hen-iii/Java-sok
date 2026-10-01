import java.util.Scanner;
void main() {
    Scanner sc=new Scanner((System.in));
    System.out.println("Kérem a mátrix sorainak számát");
    int sor= sc.nextInt();
    System.out.println("Kérem a mátrix oszlopainak számát");
    int oszlop= sc.nextInt();
    int[][]kekpill;
    kekpill=new int[sor][oszlop];
    IO.println("Kérem a mátrix számait(egész szám)");
    for(int i=0;i<sor;i++){
        for(int j=0; i<oszlop;i++){
            System.out.println("Kérem a mátrix "+i+". sorának "+j+". oszlopa számát:");
            kekpill[i][j]=sc.nextInt();
        }
    }
    for(int i=0;i<sor;i++){
        for(int j=0; i<oszlop;i++){
            IO.print(kekpill[i][j]+", ");
        }
        IO.println();
    }

}