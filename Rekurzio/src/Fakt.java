static int factorial(int n) {
    if (n == 0 || n == 1)
        return 1;
    return n * factorial(n - 1);
}

public  static double powerof(int base, int power){
    if(power==1){
        return base;
    }
   return base*powerof(base,power-1);
}
public static int fibonacci(int szam)  {
    if(szam == 0)
        return 0;
    else if(szam == 1)
        return 1;
    else
        return fibonacci(szam - 1) + fibonacci(szam - 2);
}

static void towerOfHanoi(int n, char from_rod,
                         char to_rod, char aux_rod)
{
    if (n == 0) {
        return;
    }
    towerOfHanoi(n - 1, from_rod, aux_rod, to_rod);
    System.out.println("Move disk " + n + " from rod "
            + from_rod + " to rod "
            + to_rod);
    towerOfHanoi(n - 1, aux_rod, to_rod, from_rod);
}
public static void main(String[] args) {
    int number = 5;
    int result = factorial(number);
    System.out.println("Factorial of " + number + " is : " + result);
    System.out.println(powerof(2,3));
    System.out.println(fibonacci(2));
    int N = 4;

    // A, B and C are names of rods
    towerOfHanoi(N, 'A', 'C', 'B');

}