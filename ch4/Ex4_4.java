package ch4;
class Ex4_4{
    public static void main(String[] args) {
        int sum=0;
        int k=1;
        while(sum<=100){
            sum+=k;
            k=Math.abs(k)+1;
            if(k%2==0) k=k*(-1);
        }
        System.out.println(sum);
        System.out.println(k); //k가 202일때 탈출
    }
}