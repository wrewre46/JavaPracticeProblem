class Ex6_20{
    /*
        (1) shuffle메서드를 작성하시오.
    */
    public static int[] shuffle(int[] arr){
        for(int i =0; i<arr.length; i++){
            int tmp=(int)(Math.random() * 8);
            int spare=0;
            spare = arr[i];
            arr[i]=arr[tmp];
            arr[tmp]=spare;
        }
        return arr;
    }
    public static void main(String[] args)
    {
        int[] original = {1,2,3,4,5,6,7,8,9};
        System.out.println(java.util.Arrays.toString(original));
        int[] result = shuffle(original);
        System.out.println(java.util.Arrays.toString(result));
    }
}