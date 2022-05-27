class Ex6_22 {
    /*
    (1) isNumber메서드를 작성하시오.
    */
    public static boolean isNumber(String str){
        boolean a=true;
        if(str != null && str!=""){
            for(int i = 0 ; i<str.length(); i++){
                char k = str.charAt(i);
                if('a'<k&&k<'z') {
                    a=false;
                    break;
                }
                else if('A'<k&&k<'Z'){
                    a=false;
                    break;
                }
            }   
        }
        else a=false;

        return a;
        
    }
    public static void main(String[] args) {
    String str = "123";
    System.out.println(str+"는 숫자입니까? "+isNumber(str));
    str = "1234o";
    System.out.println(str+"는 숫자입니까? "+isNumber(str));
    }
}