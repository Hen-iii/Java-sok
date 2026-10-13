static String convertToString(int[] nums){
    String result="";
    for(int i=0;i<nums.length;i++){
        result+=Integer.toString(nums[i])+", ";
    }
    return result;
}
static String convertToString(double[] nums){
    String result="";
    for(int i=0;i<nums.length;i++){
        result+=Double.toString(nums[i])+", ";
    }
    return result;
}
static String convertToString(boolean[] booleans){
    String result="";
    for(int i=0;i<booleans.length;i++){
        result+=Boolean.toString(booleans[i])+", ";
    }
    return result;
}
static String convertToString(String[] strings){
    String result="";
    for(int i=0;i<strings.length;i++){
        result+=(strings[i])+", ";
    }
    return result;
}

void main() {
    int []nums={3,2,1};
    System.out.println(convertToString(nums));
    double[]szam={3.5,2.5,5.5};
    System.out.println(convertToString(szam));
    boolean[]igaze={true,false,true};
    System.out.println(convertToString(igaze));
    String[] szoveg={"ecc","pecc","kimehetsz"};
    System.out.println(convertToString(szoveg));


}