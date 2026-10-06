void main() {
    int[] arr = { 12, 45, 67, 89, 100, 23, 3456, 897, 452, 444, 899, 700 };
    int[] arryes = { 10, 324, 45, 90, 9808 };

    int hossz=arr.length+arryes.length-2;
    int[]ossze=new int[hossz];
    int index=0;
    for(int i=0;i<arr.length-1;i++){
        ossze[index]=arr[i];
        index++;
    }
    for(int i=0;i<arryes.length-1;i++){
        ossze[index]=arryes[i];
        index++;
    }
    for(int i=0;i<ossze.length-1;i++){
        IO.println(ossze[i]);
    }
}