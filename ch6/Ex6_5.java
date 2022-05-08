public class Ex6_5 {
    public static void main(String[] args) {
        Student s =new Student("홍길동",1,1,100,60,76);
        System.out.println(s.info());     
    }
   
    
}
class Student{
    String name;
    int ban;
    int no;
    int kor;
    int eng;
    int math;
    Student(String name , int ban, int no, int kor, int eng, int math){
        this.name=name;
        this.ban=ban;
        this.no=no;
        this.kor=kor;
        this.eng=eng;
        this.math=math;
    }
    public String info(){
        return this.name+","+String.valueOf(this.ban)+","+String.valueOf(no)+","+String.valueOf(kor)+","+String.valueOf(eng)+","+String.valueOf(math)+","+String.valueOf(getTotal())+","+String.valueOf(getAverage());
    }
    public int getTotal(){
        return kor+eng+math;
    }
    public float getAverage(){
        return (int)(getTotal()/3f*10+0.5f)/10f;
    }

}