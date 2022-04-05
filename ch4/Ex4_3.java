package ch4;

public class Ex4_3 {
    public static void main(String[] args) {
        int sum=0;
        int sum2=0;
        for(int i =1; i<=10;i++){
            sum2+=i-1;
            sum+=sum2+i;
            
        }
        System.out.println("sum : "+ sum);
    }
    
}
