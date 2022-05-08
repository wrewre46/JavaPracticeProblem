
class Ex6_2 {
    public static void main(String[] args) {
        SutdaCard card1 = new SutdaCard(3, false);
        SutdaCard card2 = new SutdaCard();
        System.out.println(card1.info());
        System.out.println(card2.info());
    }
}
class SutdaCard{
    int num;
    boolean isKwang;
    SutdaCard(){
        this.isKwang=true;
    }
    SutdaCard(int num, boolean isKwang){
        this.num=num;
        this.isKwang=isKwang;
    }
    public String info(){
        if(isKwang) return "1K";
        else return String.valueOf(num);
    }
}
