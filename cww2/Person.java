package cww2;
public class Person {
    private String name;
    private  int age;
    private  String sex;
    private  static int count =0;
    public Person(){
        System.out.println("I am Person init()!");
    }

    public Person(String name,int age) {
        this.name = name;
        this.age =  age;
    }

    {
        this.age = 19;
        this.name = "kevin durant";
        this.sex = "man";// 实例代码                    0000000000000000000000000000000000000
    @Override
    public String toString() {
        return "Person{"+"name=;'" +name + '\''+",age="+age+'}';
    }
}
