package ch3;

public class Ex3_10 {
    public static void main(String[] args) {
        char ch = 'A';
        char lowerCase= ch<97 ? (char)((int)ch+32) : ch;
        System.out.println("ch : " + ch);
        System.out.println("ch to lowerCase: " + lowerCase);
    }
    
}
