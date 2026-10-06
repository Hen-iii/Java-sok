void main() {
    int[] szamok = new int[100];
    String[]fizi=new String[100];
    for (int i = 0; i < 100; i++) {
        szamok[i] = (int) (Math.random() * 100);
        if(szamok[i]%3==0 && szamok[i]%5==0){
            fizi[i]="FizzBuzz";
        }
        else if(szamok[i]%3==0){
            fizi[i]="Fizz";
        }
        else if(szamok[i]%5==0){
            fizi[i]="Buzz";
        }
        else{
            fizi[i]=String.valueOf(szamok[i]) ;
        }

    }

    int indi=14;
    for(int i=0;i<100;i++){

            IO.print(fizi[i]+", ");
        if(indi==i){

            IO.println();
            indi+=15;
        }
    }
}