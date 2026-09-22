//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    int range=200-1+1;
    int rand= (int)(Math.random()*range)+1;
    int randk= (int)(Math.random()*range)+1;
    IO.println(Math.max(rand,randk));
    IO.println(Math.min(rand,randk));
    IO.println(Math.pow(rand,2)+", "+Math.pow(randk,2));
    IO.println(rand-randk);
    IO.println(Math.sqrt(rand)+", "+Math.sqrt(randk));
    double hany= (double) rand/randk;
    IO.println(Math.round(hany));
    IO.println(Math.floor(hany));
    IO.println(Math.ceil(hany));

}
