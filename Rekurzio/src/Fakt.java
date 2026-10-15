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
public static void main(String[] args) {
    int number = 5;
    int result = factorial(number);
    System.out.println("Factorial of " + number + " is : " + result);
    System.out.println(powerof(2,3));
    System.out.println(fibonacci(2));
}