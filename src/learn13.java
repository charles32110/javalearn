
/*
rubbish recycle

cfreslease(values)
 */



public class learn13 {
    public static void main(String[] args){
        Person p = new Person();
        p.name = "jack";
        p.age = 35;
        int a = 10;//must give the value
        p.speak();



    }
}
class Person{
        String name;//member's value  default: 0
        int age;
        public void speak(){
            System.out.println(name+age);
        }
    }

