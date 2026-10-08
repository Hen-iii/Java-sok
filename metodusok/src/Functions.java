//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public static int gausSum(int szam){
    int ossz=0;
    for(int i=0;i<=szam;i++){
        ossz+=i;
    }
    return ossz;
}

public static int factorial(int fact){
    int sum=1;
    for(int i=1;i<=fact;i++){
        sum*=i;
    }
    return sum;
}

public static void fibonacci(int fibo){
    int elso=0;
    int masodik=1;
    for(int i=0;i<fibo;i++){
        System.out.print(elso+" ");
        int kovi=elso+masodik;
        elso=masodik;
        masodik=kovi;
    }
}

public static String[] appendAFunc(String[] szavak){
    String[]szosz=new String[szavak.length];
    for(int i=0;i<szavak.length-1;i++){
        szosz[i]=szavak[i]+"a";
    }
    return szosz;
}
void main() {

    Scanner sc=new Scanner((System.in));
    System.out.print("Adja meg az egész számot ameddig szeretné az összeget megtudni!");
    int szam=sc.nextInt();

   IO.println("Az eredmény: "+ gausSum(szam));

    System.out.print("Adja meg az egész számot ameddig szeretné a faktoriálist megtudni!");
    int fact=sc.nextInt();
    IO.println("Az eredmény: "+factorial(fact));

    System.out.print("Adja meg az egész számot amennyi tagját szeretné a fibonaccinak megtudni megtudni!");
    int fibo=sc.nextInt();
    fibonacci(fibo);


    String[] szavak=["koal", "pand", "zebr", "anacond", "bo", "chinchill", "cobr", "gorill", "hyen", "hydr", "iguan", "impal", "pum", "tarantul", "piranh"];
    IO.println(appendAFunc(szavak));
}
