//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

void main() {

  Random rand=new Random();
    int r1= rand.nextInt(99);
    int r2= rand.nextInt(99);
    IO.println(r1);
    IO.println(r2);

    if(r1>r2){
        int kiir=r2;
        while(kiir<r1){
            int i=0;
            if(r1-i>10){
                while(i<10){
                    if(kiir<r1){
                        IO.print(kiir+", ");
                        i++;
                        kiir++;
                    }
                  else{
                      break;
                    }
                    }
                IO.println();
                i=0;

            }
            else{
                while(i<r1-kiir){
                    if(kiir<r1){
                        IO.print(kiir+", ");
                        i++;
                        kiir++;
                    }
                    else{
                        break;
                    }

                }
                IO.println();
                i=0;

            }


        }
    }
    else{
        int kiir=r1;
        while(kiir<r2){
            int i=0;
            if(r2-i>10){
                while(i<10){
                    IO.print(kiir+", ");
                    i++;
                    kiir++;
                }
                IO.println();
                i=0;
            }
            else{
                while(i<r2-kiir){
                    IO.print(kiir+", ");
                    i++;
                    kiir++;
                }
                IO.println();
                i=0;
            }
        }
    }

}
