
/*
private
conceal the detail & reuse the code
 */


public class learn15 {
    public static void main(String[] args){
        Person1 p = new Person1();
        p.name = "mayun";
        p.setAge(20);
        p.speak();



    }

}
class Person1{
    String name;
    private int age;
    public void setAge(int myage){

        if(myage > 0 && myage <= 150){
            age = myage;
        }
        else{
            System.out.println("重新输入");
        }
    }

    public void speak(){
        String name = "jack";//part
        System.out.println("我是"+ this.name+"今年"+ age + "了");//this method to take the member's value
    }
}
