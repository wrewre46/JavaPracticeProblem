package ch3;

public class Ex3_7 {
    public static void main(String[] args) {
        int fahrenheit=100;
        float celcius = (int)(5/9f*(fahrenheit-32)*100+0.5)/100f; //Math.round()를 사용하지 않고 소수점 셋째자리에서 반올림
        System.out.println("Fahrenheit :" + fahrenheit);
        System.out.println("Celcius : "+ celcius);
    }
    
}
