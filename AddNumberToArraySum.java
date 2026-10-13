static int AddNumBerToArraySum(int num,int[] list){
    int sum=0;
    for(int i=0; i< list.length;i++){
       sum+= list[i];
    }
    sum+=num;
    return sum;
}
static double DoubleSum(double num,double[] list){
    double sum=num;
    for(int i=0; i< list.length;i++){
        sum+= list[i];
    }
    return sum;
}
void main() {

    int[]tomb= {1,2,3};
    System.out.println(AddNumBerToArraySum(3, tomb));
    double[]lis={1.5,2.5};
    System.out.println(DoubleSum(1.0,lis));

}
